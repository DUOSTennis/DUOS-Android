package com.example.duos.data.remote.chat.chat

import android.util.Log
import com.example.duos.ApplicationClass
import com.example.duos.ApplicationClass.Companion.retrofit
import com.example.duos.data.entities.ChatRoom
import com.example.duos.data.entities.MessageData
import com.example.duos.ui.main.chat.CreateChatRoomView
import com.example.duos.ui.main.chat.SendMessageView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object ChatService {
    fun createChatRoom(createChatRoomView: CreateChatRoomView, thisUserIdx: Int, targetUserIdx: Int){
        val createChatRoomService = retrofit.create(ChatRetrofitInterface::class.java)
        val chatRoom = ChatRoom(thisUserIdx, targetUserIdx)

        createChatRoomService.createChatRoom(chatRoom).enqueue(object :
            Callback<CreateChatRoomResponse>
        {
            override fun onResponse(
                call: Call<CreateChatRoomResponse>,
                response: Response<CreateChatRoomResponse>
            ) {
                val resp = response.body()!!
                Log.d("resp", resp.toString())

                when(resp.code){
                    1000 -> createChatRoomView.onCreateChatRoomSuccess()
                    else -> createChatRoomView.onCreateChatRoomFailure(resp.code, resp.message)
                }
            }

            override fun onFailure(call: Call<CreateChatRoomResponse>, t: Throwable) {
                Log.d("${ApplicationClass.TAG}/API-ERROR", t.message.toString())

                createChatRoomView.onCreateChatRoomFailure(400, "네트워크 오류가 발생했습니다.")
            }

        })
    }

    fun sendMessage(sendMessageView: SendMessageView, receiverIdx: Int, senderIdx: Int, message: String, type: String, chatRoomIdx: String){
        val sendMessageService = retrofit.create(ChatRetrofitInterface::class.java)
        val message = MessageData(chatRoomIdx, type, senderIdx, receiverIdx, message)

        sendMessageService.sendMessage(message).enqueue(object: Callback<SendMessageResponse>{
            override fun onResponse(
                call: Call<SendMessageResponse>,
                response: Response<SendMessageResponse>
            ) {
                val resp = response.body()!!
                Log.d("resp", resp.toString())

                when(resp.code){
                    1000 -> sendMessageView.onSendMessageSuccess()
                    else -> sendMessageView.onSendMessageFailure(resp.code, resp.message)
                }
            }

            override fun onFailure(call: Call<SendMessageResponse>, t: Throwable) {
                Log.d("${ApplicationClass.TAG}/API-ERROR", t.message.toString())

                sendMessageView.onSendMessageFailure(400, "네트워크 오류가 발생했습니다.")
            }

        })

    }
}