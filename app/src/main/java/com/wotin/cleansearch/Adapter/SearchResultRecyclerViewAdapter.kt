package com.wotin.cleansearch.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wotin.cleansearch.CustomClass.SearchResultCustomClass
import com.wotin.cleansearch.R

class SearchResultRecyclerViewAdapter(val searchResultList: ArrayList<SearchResultCustomClass>, val searchResultClickListener:SearchResultClickListener) :
    RecyclerView.Adapter<SearchResultRecyclerViewAdapter.CustomViewHolder>() {

    interface SearchResultClickListener {
        fun searchResultClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.search_result_list_item, parent, false)
        return CustomViewHolder(view).apply {
            itemView.setOnClickListener {
                searchResultClickListener.searchResultClick(adapterPosition)
            }
        }
    }

    override fun getItemCount(): Int {
        return searchResultList.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.rankText.text = searchResultList[position].rank.toString()
        holder.searchSentenceText.text = searchResultList[position].sentences
        holder.scoreText.text = searchResultList[position].score.toString()
    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val rankText = itemView.findViewById<TextView>(R.id.rankTextView)
        val searchSentenceText =
            itemView.findViewById<TextView>(R.id.searchSentenceTextViewSearchResult)
        val scoreText = itemView.findViewById<TextView>(R.id.searchScoreTextView)
    }
}
