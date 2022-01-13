package com.example.duos.ui.signup

import android.util.Log
import android.view.View
import androidx.navigation.NavController

import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI

import com.example.duos.R

import com.example.duos.databinding.ActivitySignupBinding
import com.example.duos.ui.BaseActivity



class SignUpActivity: BaseActivity<ActivitySignupBinding>(ActivitySignupBinding::inflate), SignUpView, View.OnClickListener {

    override fun initAfterBinding() {


        supportFragmentManager.beginTransaction().replace(R.id.signup_fragment_container_fc, SignUpFragment01())
            .commitAllowingStateLoss()

        binding.signupNextBtn.setOnClickListener {
            initNavController()
        }


//        binding.signUpBackIv.setOnClickListener(this)
//        binding.signUpSignUpBtn.setOnClickListener(this)
    }

    private fun initNavController(){

        supportFragmentManager.run {
            if (findFragmentById(R.id.signup_fragment_container_fc) is SignUpFragment01){
                beginTransaction()
                    .replace(R.id.signup_fragment_container_fc, SignUpFragment02())
                    .addToBackStack(null)
                    .commit()
            }
            if (findFragmentById(R.id.signup_fragment_container_fc) is SignUpFragment02){
                beginTransaction()
                    .replace(R.id.signup_fragment_container_fc, SignUpFragment03())
                    .addToBackStack(null)
                    .commit()
            }
            if (findFragmentById(R.id.signup_fragment_container_fc) is SignUpFragment03){
                beginTransaction()
                    .replace(R.id.signup_fragment_container_fc, SignUpFragment04())
                    .addToBackStack(null)
                    .commit()
            }
            if (findFragmentById(R.id.signup_fragment_container_fc) is SignUpFragment04){
                beginTransaction()
                    .replace(R.id.signup_fragment_container_fc, SignUpFragment05())
                    .addToBackStack(null)
                    .commit()
            }



        }

//
//        val navHostFragment = supportFragmentManager.findFragmentById(R.id.signup_fragment_container_fc) as NavHostFragment
//        val navController = navHostFragment.navController
//
//        navController.addOnDestinationChangedListener { _, destination, _ ->
//            Log.d("현재", destination.label as String)
//            if(destination.id == R.id.signup_fragment_01) {
//                navController.navigate(R.id.action_signup_fragment_01_to_signup_fragment_02)
//            }
//            else if(destination.id == R.id.signup_fragment_02) {
//                navController.navigate(R.id.action_signup_fragment_02_to_signup_fragment_03)
//            }
//            else if(destination.id == R.id.signup_fragment_03) {
//                navController.navigate(R.id.action_signup_fragment_03_to_signup_fragment_04)
//            }
//            else if(destination.id == R.id.signup_fragment_04) {
//                navController.navigate(R.id.action_signup_fragment_04_to_signup_fragment_05)
//            }
//        }



    }

    override fun onClick(v: View?) {
//        if(v == null) return
//
//        when(v) {
//            binding.signUpBackIv -> finish()
//            binding.signUpSignUpBtn -> signUp()
//        }
    }

//    private fun getUser(): User {
//        val email: String =
//            binding.signUpIdEt.text.toString() + "@" + binding.signUpDirectInputEt.text.toString()
//        val pwd: String = binding.signUpPasswordEt.text.toString()
//        val name: String = binding.signUpNameEt.text.toString()
//
//        return User(email, pwd, name)
//    }

    private fun signUp() {
//        if (binding.signUpIdEt.text.toString()
//                .isEmpty() || binding.signUpDirectInputEt.text.toString().isEmpty()
//        ) {
//            Toast.makeText(this, "이메일 형식이 잘못되었습니다.", Toast.LENGTH_SHORT).show()
//            return
//        }
//
//        if (binding.signUpNameEt.text.toString().isEmpty()) {
//            Toast.makeText(this, "이름 형식이 잘못되었습니다.", Toast.LENGTH_SHORT).show()
//            return
//        }
//
//        if (binding.signUpPasswordEt.text.toString() != binding.signUpPasswordCheckEt.text.toString()) {
//            Toast.makeText(this, "비밀번호가 일치하지 않습니다.", Toast.LENGTH_SHORT).show()
//            return
//        }
//
//        AuthService.signUp(this, getUser())
    }

    override fun onSignUpLoading() {
//        binding.signUpLoadingPb.visibility = View.VISIBLE
    }

    override fun onSignUpSuccess() {
//        binding.signUpLoadingPb.visibility = View.GONE
//
//        finish()
    }

    override fun onSignUpFailure(code: Int, message: String) {
//        binding.signUpLoadingPb.visibility = View.GONE
//
//        when(code) {
//            2016, 2017 -> {
//                binding.signUpEmailErrorTv.visibility = View.VISIBLE
//                binding.signUpEmailErrorTv.text = message
//            }
//        }
    }
}