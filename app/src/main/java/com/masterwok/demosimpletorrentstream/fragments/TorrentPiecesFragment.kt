package com.masterwok.demosimpletorrentstream.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.masterwok.demosimpletorrentstream.R
import com.masterwok.demosimpletorrentstream.contracts.TabFragment
import com.masterwok.simpletorrentstream.models.TorrentSessionStatus


class TorrentPiecesFragment : Fragment(), TabFragment<TorrentSessionStatus> {

    override fun onCreateView(
            inflater: LayoutInflater
            , container: ViewGroup?
            , savedInstanceState: Bundle?
    ): View = inflater.inflate(
            R.layout.fragment_torrent_pieces
            , container
            , false
    )

    override fun getTitle(): String = "Pieces"

    override fun configure(model: TorrentSessionStatus) {
    }
}