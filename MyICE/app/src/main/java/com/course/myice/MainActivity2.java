package com.course.myice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private Intent intent;
    private int number;


    ImageView image1,image2;
    TextView text4,text5,text6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        intent = getIntent();
        number = intent.getIntExtra("number", -1);


        image1=(ImageView) findViewById(R.id.imageView2);
        image2=(ImageView) findViewById(R.id.imageView3);
        text6=(TextView) findViewById(R.id.textView6);

        switch(number){
            case 0:
                image1.setImageResource(R.drawable.dobby);
                image2.setImageResource(R.drawable.dobby1);
                text6.append("상품명 : 도비 \n");
                text6.append("가격 : 500원\n");
                text6.append("상세설명 : 자유로운 집요정 도비, 도비는 자유예요\n");
                break;
            case 1:
                image1.setImageResource(R.drawable.wand);
                image2.setImageResource(R.drawable.wand1);
                text6.append("상품명 : 딱총나무 지팡이 \n");
                text6.append("가격 : 100,000,000원\n");
                text6.append("상세설명 : 죽음의 성물 중 하나인 딱총나무 지팡이, 최강의 지팡이로 거론된다\n");
                break;
            case 2:
                image1.setImageResource(R.drawable.cape);
                image2.setImageResource(R.drawable.cape1);
                text6.append("상품명 : 투명망토 \n");
                text6.append("가격 : 100,000,000원\n");
                text6.append("상세설명 : 죽음의 성물 중 하나인 투명망토, 착용자의 몸을 투명하게 가려준다\n");
                break;
            case 3:
                image1.setImageResource(R.drawable.stone);
                image2.setImageResource(R.drawable.stone1);
                text6.append("상품명 : 부활의 돌 \n");
                text6.append("가격 : 100,000,000원\n");
                text6.append("상세설명 : 죽음의 성물 중 하나인 부활의 돌, 손바닥에 올려놓고 세 번 뒤집으면 죽은 사람들을 만날 수 있다\n");
                break;
            case 4:
                image1.setImageResource(R.drawable.gollum);
                image2.setImageResource(R.drawable.gollum1);
                text6.append("상품명 : 골룸 \n");
                text6.append("가격 : 100원\n");
                text6.append("상세설명 : 절대반지를 탐내는 빌런, 의도치 않게 주인공을 도와주는 불편한 동행\n");
                break;
            case 5:
                image1.setImageResource(R.drawable.ring);
                image2.setImageResource(R.drawable.ring1);
                text6.append("상품명 : 절대반지\n");
                text6.append("가격 : 900,000,000원\n");
                text6.append("상세설명 : 반지의 제왕에 등장하는 힘의 반지 중 하나로, 가장 으뜸이자 나머지 반지를 모두 지배하는 유일한 반지\n");
                break;
            case 6:
                image1.setImageResource(R.drawable.shield);
                image2.setImageResource(R.drawable.shield1);
                text6.append("상품명 : 캡틴아메리카 방패 \n");
                text6.append("가격 : 50,000,000원\n");
                text6.append("상세설명 : 캡틴 아메리카의 방패, 비브라늄으로 만들어져 물리법칙을 무시하고 완벽한 방호력을 보장한다\n");
                break;
            case 7:
                image1.setImageResource(R.drawable.hammer);
                image2.setImageResource(R.drawable.hammer1);
                text6.append("상품명 : 묠니르\n");
                text6.append("가격 : 800,000,000원\n");
                text6.append("상세설명 : 토르의 묠니르, 아스가르드 왕권을 계승할 후계자를 상징하는 물건\n");
                break;
            case 8:
                image1.setImageResource(R.drawable.stormbraker);
                image2.setImageResource(R.drawable.stormbraker1);
                text6.append("상품명 : 스톰 브레이커 \n");
                text6.append("가격 : 990,000,000원\n");
                text6.append("상세설명 : 타노스를 상대하기 위해 만든 토르의 스톰브레이커, 묠니르가 만들어진 니다벨리르에서 만들었다\n");
                break;
            case 9:
                image1.setImageResource(R.drawable.infinite);
                image2.setImageResource(R.drawable.infinite1);
                text6.append("상품명 : 인피니티 건틀렛 \n");
                text6.append("가격 : 9,900,000,000원\n");
                text6.append("상세설명 : 인피니티 건틀렛, 6개의 인피니티 스톤을 모두 장착하여 범우주적인 능력을 지닌다\n");
                break;

        }





    }
}