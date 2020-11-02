package com.enzocorp.toshokan

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_about.*

class AboutFragment : Fragment() {

    var mediaPlayer: MediaPlayer? = null

    override fun onCreateView( inflater: LayoutInflater,  container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        return inflater.inflate(R.layout.fragment_about, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        // Fonction OnClick - Lorsque l'utilisateur clique, un Toast s'affiche et la lecture du fichier MP3 est lancé une fois
        fab.setOnClickListener {
            Toast.makeText(context, "Apprenez à prononcer votre App !", Toast.LENGTH_LONG).show()

            if (mediaPlayer == null) {
                mediaPlayer = MediaPlayer.create(context, R.raw.toshokan);
            }
            mediaPlayer?.start()
        }
    }
}