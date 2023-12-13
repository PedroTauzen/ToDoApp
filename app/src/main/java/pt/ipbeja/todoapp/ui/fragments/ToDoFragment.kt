package pt.ipbeja.todoapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import pt.ipbeja.todoapp.databinding.FragmentToDoBinding

class ToDoFragment : Fragment() {

    private lateinit var binding: FragmentToDoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentToDoBinding.inflate(inflater).also {
        binding = it
    }.root

}