package com.simplepro.cleansearch.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.simplepro.cleansearch.Instance.SearchResultInstance
import com.simplepro.cleansearch.R
import kotlinx.android.synthetic.main.search_result_list_item.view.*

class SearchResultRecyclerViewAdapter(val searchResultList : ArrayList<SearchResultInstance>) : RecyclerView.Adapter<SearchResultRecyclerViewAdapter.CustomViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.search_result_list_item, parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return searchResultList.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.rankText.text = searchResultList[position].rank
        holder.searchSentenceText.text = searchResultList[position].sentences
        holder.scoreText.text = searchResultList[position].score
    }

    class CustomViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val rankText = itemView.findViewById<TextView>(R.id.rankTextView)
        val searchSentenceText = itemView.findViewById<TextView>(R.id.searchSentenceTextViewSearchResult)
        val scoreText = itemView.findViewById<TextView>(R.id.searchScoreTextView)
    }
}