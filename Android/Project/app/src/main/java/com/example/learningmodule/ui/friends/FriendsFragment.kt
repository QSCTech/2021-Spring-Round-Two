package com.example.learningmodule.ui.friends

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.learningmodule.MessageActivity
import com.example.learningmodule.databinding.FragmentFriendsBinding
import com.example.learningmodule.databinding.FriendsItemBinding

@BindingAdapter("bindData")
fun RecyclerView.bindData(data: List<String>) {
    // TODO: Implement this function
}

class FriendsAdapter(var data: List<String>) :
    RecyclerView.Adapter<FriendsAdapter.FriendsViewHolder>() {
    class FriendsViewHolder(private val binding: FriendsItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            // TODO: Complete constructor
            //       hint - set button's listener here
        }

        fun bind(name: String) {
            // TODO: Implement this function
            //       hint - don't forget to executePendingBindings
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendsViewHolder {
        val binding = FriendsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FriendsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FriendsViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size
}

class FriendsFragment : Fragment() {

    private val friendsViewModel: FriendsViewModel by // TODO: by what?
    private lateinit var rv: RecyclerView

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // TODO: Implement onCreateView

    }
}
