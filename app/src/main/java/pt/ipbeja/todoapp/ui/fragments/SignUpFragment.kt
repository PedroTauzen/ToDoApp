package pt.ipbeja.todoapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import pt.ipbeja.todoapp.R
import pt.ipbeja.todoapp.databinding.FragmentSingUpBinding

class SignUpFragment : Fragment() {

    private lateinit var binding: FragmentSingUpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentSingUpBinding.inflate(inflater).also {
        binding = it
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.alreadyHaveAccountTxt.setOnClickListener {
            findNavController()
                .navigateUp()
        }
        binding.signUpButton.setOnClickListener {
            findNavController()
                .navigateUp()
        }
    }
}