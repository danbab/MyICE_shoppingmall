package com.course.myice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3;

    private RecyclerView myRecyclerView;
    private RecyclerView.LayoutManager myLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("tel:01099037945"));
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view) {
                sendEmail();
            }
        });

        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MapsActivity.class);
                startActivity(intent);
            }
        });

        myRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        myRecyclerView.setHasFixedSize(true);
        myLayoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(myLayoutManager);

        ArrayList<Stuffs> MDsInfo = new ArrayList<>();

        MDsInfo.add(new Stuffs(R.drawable.dobby,R.drawable.dobby1,"집요정 도비","500원",
                "자유로운 집요정 도비, 도비는 자유에요"));
        MDsInfo.add(new Stuffs(R.drawable.wand,R.drawable.wand1,"딱총나무 지팡이","1억원",
                "죽음의 성물 중 하나인 딱총나무 지팡이, 최강의 지팡이로 거론된다"));
        MDsInfo.add(new Stuffs(R.drawable.cape,R.drawable.cape1,"투명망토","1억원",
                "죽음의 성물 중 하나인 투명망토, 착용자의 몸을 투명하게 가려준다"));
        MDsInfo.add(new Stuffs(R.drawable.stone,R.drawable.stone1,"부활의 돌","1억원",
                "죽음의 성물 중 하나인 부활의 돌, 손바닥에 올려놓고 세 번 뒤집으면 죽은 사람들을 만날 수 있다"));
        MDsInfo.add(new Stuffs(R.drawable.gollum,R.drawable.gollum1,"골룸","100원",
                "절대반지를 탐내는 빌런, 의도치 않게 주인공을 도와주는 불편한 동행"));
        MDsInfo.add(new Stuffs(R.drawable.ring,R.drawable.ring1,"절대반지","9억원",
                "반지의 제왕에 등장하는 힘의 반지 중 하나로, 가장 으뜸이자 나머지 반지를 모두 지배하는 유일한 반지"));
        MDsInfo.add(new Stuffs(R.drawable.shield,R.drawable.shield1,"캡틴아메리카 방패","5천만원",
                "캡틴 아메리카가 사용하는 방패, 비브라늄으로 만들어져 물리법칙을 무시하고 완벽한 방호력을 보장한다"));
        MDsInfo.add(new Stuffs(R.drawable.hammer,R.drawable.hammer1,"묠니르","8억원",
                "토르의 묠니르, 아스가르드 왕권을 계승할 후계자를 상징하는 물건"));
        MDsInfo.add(new Stuffs(R.drawable.stormbraker,R.drawable.stormbraker1,"스톰 브레이커","9억 9천만원",
                "타노스를 상대하기 위해 만든 토르의 스톰브레이커, 묠니르가 만들어진 니다벨리르에서 만들었다"));
        MDsInfo.add(new Stuffs(R.drawable.infinite,R.drawable.infinite1,"인피니티 건틀렛","99억원",
                "인피니티 건틀렛, 6개의 인피니티 스톤을 모두 장착하여 범우주적인 능력을 지닌다"));

        MyAdapter myAdapter= new MyAdapter(MDsInfo);
        myRecyclerView.setAdapter(myAdapter);
    }

    protected void sendEmail() {
        String[] TO = {"2016112241@dongguk.edu"};
        String[] CC = {""};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT,
                "");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "제품 이름 : " +"\n"+
                "문의 사항 :");
        try {
            startActivity(Intent.createChooser(emailIntent,
                    "이메일 보내기..."));
            finish();
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(MainActivity.this, "이메일클라이언트가 없네요.", Toast.LENGTH_SHORT).show();
        }
    }
}