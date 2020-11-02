package com.enzocorp.toshokan

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_home.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class HomeFragment : Fragment() {

    override fun onCreateView( inflater: LayoutInflater,  container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //CONSTRUCTION RETROFIT + REQUETE SUR LE SERVEUR JSONSERVER + AFFICHAGE DES DONNEES GRACE A SHOWDATA (Dans MangaAdapter)
        val url = "https://my-json-server.typicode.com/ecandotti/toshokan/"
        val retrofit = Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(MangaService::class.java)

        val reqGet = service.getMangas()


        reqGet.enqueue(object : Callback<List<Manga>> {

            override fun onResponse(call: Call<List<Manga>>, response: Response<List<Manga>> ) {
                showData(response.body()!!)
            }

            //S'AFFICHE DANS LES LOG SI LA REQUETE N'A PAS ABOUTI
            override fun onFailure(call: Call<List<Manga>>, t: Throwable) {
                Log.e("EnzoAPI", "On Failure")
            }
        })
    }
    private fun showData(mangas: List<Manga>) {
        recycler_view.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = MangaAdapter(mangas)
        }
    }
}