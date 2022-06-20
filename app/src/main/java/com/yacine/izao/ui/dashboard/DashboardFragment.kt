package com.yacine.izao.ui.dashboard
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.yacine.izao.R
import com.yacine.izao.ui.dashboard.DashboardViewModel
import com.yacine.izao.databinding.FragmentDashboardBinding






class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.toggleButtonGroup.addOnButtonCheckedListener { toggleButtonGroup, checkedId, isChecked ->

            if (isChecked) {
                when (checkedId) {
                    R.id.btnAndroid -> showToast("Robot that looks like human.")
                    R.id.btnFlutter -> showToast("It's a Butterfly thing.")

                }
            } else {
                if (toggleButtonGroup.checkedButtonId == View.NO_ID) {
                    showToast("Nothing Selected")
                }
            }
        }



/*
        val textView: TextView = binding.textdashboard
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }*/
        return root



    }

    private fun showToast(str: String) {
        Toast.makeText(activity?.baseContext, str, Toast.LENGTH_SHORT).show()
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}