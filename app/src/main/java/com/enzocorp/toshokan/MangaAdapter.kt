package com.enzocorp.toshokan

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.manga_item.view.*

class MangaAdapter(private val mangas: List<Manga>) : RecyclerView.Adapter<MangaAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.manga_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: MangaAdapter.ViewHolder, position: Int) {
        val manga = mangas[position]
        val imageView = holder.img

        //LOG POUR ANALYSER L'ETAT DE LA REQUETE + REMPLACEMENT DES DONNEES DU RECYCLERVIEW PAR LES ELEMENTS OBTENU GRACE A L'API
        Log.e("EnzoAPI", "Work")
        holder.title.text = manga.title
        holder.desc.text = manga.desc

        //TRANSFORMATION D'UNE URL EN IMG (Picasso)
        Picasso.get()
            .load(manga.img)
            .resize(50, 50)
            .into(imageView)
    }

    override fun getItemCount() = mangas.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.mangaTitle
        val desc: TextView = itemView.mangaDesc
        val img: ImageView = itemView.mangaImg
    }
}