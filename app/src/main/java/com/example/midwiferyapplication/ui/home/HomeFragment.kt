package com.example.midwiferyapplication.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.midwiferyapplication.ui.akreditas.AkreditasActivity
import com.example.midwiferyapplication.ui.fasilitas.FasilitasActivity
import com.example.midwiferyapplication.ui.galeri.GaleriActivity
import com.example.midwiferyapplication.ui.mahasiswa.MahasiswaActivity
import com.example.midwiferyapplication.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        setupIntentViews()
        return binding.root
    }

    private fun setupIntentViews() {
        binding.tvMahasiswa.setOnClickListener {
            startActivity(Intent(requireContext(), MahasiswaActivity::class.java))
        }
        binding.tvAkreditas.setOnClickListener {
            startActivity(Intent(requireContext(), AkreditasActivity::class.java))
        }
        binding.tvFasilitas.setOnClickListener {
            startActivity(Intent(requireContext(), FasilitasActivity::class.java))
        }
        binding.tvGaleri.setOnClickListener {
            startActivity(Intent(requireContext(), GaleriActivity::class.java))
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}