package pt.ipbeja.todoapp.ui.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import pt.ipbeja.todoapp.R
import pt.ipbeja.todoapp.databinding.FragmentLogInBinding
import pt.ipbeja.todoapp.ui.activities.HomeActivity

class LogInFragment : Fragment() {

    private lateinit var binding: FragmentLogInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentLogInBinding.inflate(inflater).also {
        binding = it
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.createAccountTxt.setOnClickListener {
            findNavController()
                .navigate(R.id.singUpFragment)
        }
        binding.loginButton.setOnClickListener {
            val intent = Intent(requireActivity(), HomeActivity::class.java)
            startActivity(intent)
            //requireActivity().finish()
        }
    }
}