package com.example.selection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.selection.databinding.ActivityFunctionAddCardBenefitBinding;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FunctionIOShinhan extends AppCompatActivity {

    private FirebaseFirestore db;
    private ActivityFunctionAddCardBenefitBinding binding;
    private final String TAG = "SMG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFunctionAddCardBenefitBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        db = FirebaseFirestore.getInstance();
        addShinhanCardData(
                0,
                "11번가 신한카드 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1187965_2206.html",
                false, false,
                false, false,
                false, false,
                true, true,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.2, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );

        addShinhanCardData(
                1,
                "CJ ONE 신한카드 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1188363_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                2,
                "GS Prime 신한카드 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1218653_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                3,
                "GS칼텍스 신한카드 경차사랑 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1188342_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                4,
                "KBO 제휴 신한카드 MY KBO 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1188336_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                5,
                "KT 신한카드 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1188338_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                6,
                "L.PAY 신한카드 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1197028_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                7,
                "LG트위스 신한카드 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1218091_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                8,
                "S.Sing 씽화물복지 신한카드 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1188367_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                9,
                "SOCAR 제휴 SOCAR 신한카드 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1188332_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                10,
                "SOL Deep Dream 신한카드 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1188339_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                11,
                "개인택시운송사업자 신한카드 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1202025_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                12,
                "공무원연금복지 신한카드 S-Choice (선택형) 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1195594_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                13,
                "국민내일배움 FANtastic S 신한카드 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1195347_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                14,
                "나주사랑 신한카드 S-Choice(선택형) 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1197175_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                15,
                "네이버페이 신한카드 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1187964_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                16,
                "다이소 신한카드 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1188330_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                17,
                "대덕e로움 신한카드 S-Choice 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1202645_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                18,
                "더본 신한카드 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1188326_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                19,
                "땡겨요 신한카드 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1215119_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                20,
                "땡겨요 신한카드 체크(라이더형)",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1215124_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                21,
                "리디 신한카드 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1188337_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                22,
                "마이 홈플러스 신한카드 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1187971_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                23,
                "메가쇼핑 신한카드 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1195474_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                24,
                "몰테일 신한카드 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1188334_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                25,
                "부산가족사랑 신한카드 S-Choice 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1188350_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                26,
                "삼성증권 CMA 신한카드 Big Plus 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1188355_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                27,
                "성남사랑 신한카드 Deep Dream 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1188371_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                28,
                "성남사랑 신한카드 Deep Dream 체크(chak)",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1201121_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                29,
                "성남시 아동수당 신한카드 Deep Dream 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1188345_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                30,
                "스포츠바우처 카카오페이 신한 체크카드(무지)",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1196087_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );
        addShinhanCardData(
                31,
                "신세계 신한카드 체크",
                "https://www.shinhancard.com/pconts/html/card/apply/check/1187968_2206.html",
                false, false,
                false, false,
                false, false,
                true, false,
                false, false,
                false, false,
                false, false,
                false, false,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.3, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0,
                0, 0.0, 0, 0.0
        );




//        getShinhanCardDataToLog(0);
        getShinhanCardDataToFunctionCard(0);



    }

    private void getShinhanCardDataToLog(int index){
        db.collection("Shinhan")
                .whereEqualTo("cardIndex", index)
                .get()
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        for (QueryDocumentSnapshot document : task.getResult()) {
                            Log.d(TAG, document.getId() + " => " + document.getData());
                        }
                    } else {
                        Log.d(TAG, "Error getting documents: ", task.getException());
                    }
                });
    }
    private void getShinhanCardDataToFunctionCard(int index){

        db.collection("Shinhan")
                .whereEqualTo("cardIndex", index)
                .get()
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        for (QueryDocumentSnapshot document : task.getResult()) {
                            FunctionCard functionCard = document.toObject(FunctionCard.class);

//                            functionCard.setAmusementDiscount(getFunctionSpecificDiscount(document, "amusementDiscount"));
//                            functionCard.setBakeryDiscount(getFunctionSpecificDiscount(document, "bakeryDiscount"));
//                            functionCard.setBookstoreDiscount(getFunctionSpecificDiscount(document, "bookstoreDiscount"));
//                            functionCard.setCafeDiscount(getFunctionSpecificDiscount(document, "cafeDiscount"));
//                            functionCard.setConvenientStoreDiscount(getFunctionSpecificDiscount(document, "convenientStoreDiscount"));
//                            functionCard.setFastFoodDiscount(getFunctionSpecificDiscount(document, "fastFoodDiscount"));
//                            functionCard.setRestaurantDiscount(getFunctionSpecificDiscount(document, "restaurantDiscount"));
                            try {
                                functionCard.setTheaterDiscount(getFunctionSpecificDiscountArrayList(document, "theaterDiscount"));
                            } catch (Exception e) {
                                throw new RuntimeException(e);
                            }


                            Log.d(TAG, "cardName = " + functionCard.getCardApplicationLink());
                            Log.d(TAG, "cgv캐시백 = " + functionCard.getTheaterDiscount().get(0).getCashbackRate());

                        }
                    } else {
                        Log.d(TAG, "Error getting documents: ", task.getException());
                    }
                });


    }



    private ArrayList<FunctionLocationSpecificDiscount> getFunctionSpecificDiscountArrayList(QueryDocumentSnapshot document, String specificDiscount) throws Exception {
        ArrayList<FunctionLocationSpecificDiscount> functionLocationSpecificDiscountArrayList = new ArrayList<>();
        switch (specificDiscount){
//            case "amusementDiscount":
//                break;
//            case "bakeryDiscount":
//                break;
//            case "bookstoreDiscount":
//                break;
//            case "cafeDiscount":
//                break;
//            case "convenientStoreDiscount":
//                break;
//            case "fastFoodDiscount":
//                break;
//            case "restaurantDiscount":
//                break;
            case "theaterDiscount":
                functionLocationSpecificDiscountArrayList.add(getFunctionSpecificDiscount(document, specificDiscount, "CGV"));
                functionLocationSpecificDiscountArrayList.add(getFunctionSpecificDiscount(document, specificDiscount, "메가박스"));
                break;

        }

        return functionLocationSpecificDiscountArrayList;
    }
    private FunctionLocationSpecificDiscount getFunctionSpecificDiscount(QueryDocumentSnapshot queryDocumentSnapshot, String specificDiscount, String locationName) throws Exception {

        Task<DocumentSnapshot> task = queryDocumentSnapshot.getReference().collection(specificDiscount).document(locationName).get();
        while(!task.isComplete()){Thread.sleep(100);}

        // 작업이 성공적으로 완료됐는지 확인
        if (task.isSuccessful()) {
            DocumentSnapshot document = task.getResult();
            if (document.exists()) {
                return document.toObject(FunctionLocationSpecificDiscount.class);
            } else {
                throw new Exception("Document not found");
            }
        } else {
            throw new Exception("Error getting document", task.getException());
        }











    }

    private void addShinhanCardData(
            int cardIndex, String cardName, String cardApplicationLink,
            boolean ifDiscountAmusement,boolean ifDiscountAmusementAll,
            boolean ifDiscountBakery, boolean ifDiscountBakeryAll,
            boolean ifDiscountBookStore, boolean ifDiscountBookStoreAll,
            boolean ifDiscountCafe, boolean ifDiscountCafeAll,
            boolean ifDiscountConvenientStore, boolean ifDiscountConvenientStoreAll,
            boolean ifDiscountFastFood, boolean ifDiscountFastFoodAll,
            boolean ifDiscountRestaurant, boolean ifDiscountRestaurantAll,
            boolean ifDiscountTheater, boolean ifDiscountTheaterAll,
            int amusementDiscountAmount, double amusementDiscountRate, int amusementCashbackAmount, double amusementCashbackRate,
            int bakeryDiscountAmount, double bakeryDiscountRate, int bakeryCashbackAmount, double bakeryCashbackRate,
            int bookStoreDiscountAmount, double bookStoreDiscountRate, int bookStoreCashbackAmount, double bookStoreCashbackRate,
            int cafeDiscountAmount, double cafeDiscountRate, int cafeCashbackAmount, double cafeCashbackRate,
            int convenientStoreDiscountAmount, double convenientStoreDiscountRate, int convenientStoreCashbackAmount, double convenientStoreCashbackRate,
            int fastFoodDiscountAmount, double fastFoodDiscountRate, int fastFoodCashbackAmount, double fastFoodCashbackRate,
            int restaurantDiscountAmount, double restaurantDiscountRate, int restaurantCashbackAmount, double restaurantCashbackRate,
            int theaterDiscountAmount, double theaterDiscountRate, int theaterCashbackAmount, double theaterCashbackRate) {

        //신한collection >> cardName문서 저장
        CollectionReference cardCompanyRef = db.collection("Shinhan");
        FunctionCard functionCard = new FunctionCard(
                cardIndex, cardName, cardApplicationLink,
                ifDiscountAmusement, ifDiscountAmusementAll,
                ifDiscountBakery, ifDiscountBakeryAll,
                ifDiscountBookStore, ifDiscountBookStoreAll,
                ifDiscountCafe, ifDiscountCafeAll,
                ifDiscountConvenientStore, ifDiscountConvenientStoreAll,
                ifDiscountFastFood, ifDiscountFastFoodAll,
                ifDiscountRestaurant, ifDiscountRestaurantAll,
                ifDiscountTheater, ifDiscountTheaterAll);
        cardCompanyRef.document(String.valueOf(cardIndex)).set(functionCard);
        setSubCollections(cardCompanyRef, cardIndex,
                ifDiscountAmusementAll, ifDiscountBakeryAll,
                ifDiscountBookStoreAll, ifDiscountCafeAll,
                ifDiscountConvenientStoreAll, ifDiscountFastFoodAll,
                ifDiscountRestaurantAll, ifDiscountTheaterAll,
                amusementDiscountAmount, amusementDiscountRate, amusementCashbackAmount, amusementCashbackRate,
                bakeryDiscountAmount, bakeryDiscountRate, bakeryCashbackAmount, bakeryCashbackRate,
                bookStoreDiscountAmount, bookStoreDiscountRate, bookStoreCashbackAmount, bookStoreCashbackRate,
                cafeDiscountAmount, cafeDiscountRate, cafeCashbackAmount, cafeCashbackRate,
                convenientStoreDiscountAmount, convenientStoreDiscountRate, convenientStoreCashbackAmount, convenientStoreCashbackRate,
                fastFoodDiscountAmount, fastFoodDiscountRate, fastFoodCashbackAmount,fastFoodCashbackRate,
                restaurantDiscountAmount, restaurantDiscountRate, restaurantCashbackAmount, restaurantCashbackRate,
                theaterDiscountAmount, theaterDiscountRate, theaterCashbackAmount, theaterCashbackRate
        );


    }

    private Map<String, Object> makeSpecificDiscountInfo(
            int discountAmount, double discountRate,
            int cashbackAmount, double cashbackRate){
        Map<String, Object> specificDiscountInfo = new HashMap<>();
        specificDiscountInfo.put("discountAmount", discountAmount);
        specificDiscountInfo.put("discountRate", discountRate);
        specificDiscountInfo.put("cashbackAmount", cashbackAmount);
        specificDiscountInfo.put("cashbackRate", cashbackRate);
        specificDiscountInfo.put("ifLimitDayOfWeek", false);
        specificDiscountInfo.put("ifLimitTime", false);
        specificDiscountInfo.put("validDayOfWeek", Arrays.asList(""));
        specificDiscountInfo.put("validTime", Arrays.asList(""));
        specificDiscountInfo.put("details", "");



        return specificDiscountInfo;
    }


    private void setSubDocuments(CollectionReference cardCompanyRef, String cardIndex, String discountCategory, int discountAmount, double discountRate, int cashbackAmount, double cashbackRate){
        switch(discountCategory){
            case "amusementDiscount":
                cardCompanyRef.document(cardIndex).collection("amusementDiscount").document("캐리비안베이").set(makeSpecificDiscountInfo(discountAmount, discountRate, cashbackAmount, cashbackRate));
                cardCompanyRef.document(cardIndex).collection("amusementDiscount").document("서울랜드").set(makeSpecificDiscountInfo(discountAmount, discountRate, cashbackAmount, cashbackRate));
                cardCompanyRef.document(cardIndex).collection("amusementDiscount").document("롯데월드").set(makeSpecificDiscountInfo(discountAmount, discountRate, cashbackAmount, cashbackRate));
                break;
            case "bakeryDiscount":
                cardCompanyRef.document(cardIndex).collection("bakeryDiscount").document("파리바게뜨").set(makeSpecificDiscountInfo(discountAmount, discountRate, cashbackAmount, cashbackRate));
                cardCompanyRef.document(cardIndex).collection("bakeryDiscount").document("파리크라상").set(makeSpecificDiscountInfo(discountAmount, discountRate, cashbackAmount, cashbackRate));
                cardCompanyRef.document(cardIndex).collection("bakeryDiscount").document("뚜레쥬르").set(makeSpecificDiscountInfo(discountAmount, discountRate, cashbackAmount, cashbackRate));
                break;
            case "bookStoreDiscount":
                cardCompanyRef.document(cardIndex).collection("bookStoreDiscount").document("교보문고").set(makeSpecificDiscountInfo(discountAmount, discountRate, cashbackAmount, cashbackRate));
                cardCompanyRef.document(cardIndex).collection("bookStoreDiscount").document("yes24").set(makeSpecificDiscountInfo(discountAmount, discountRate, cashbackAmount, cashbackRate));
                break;
            case "cafeDiscount" :
                cardCompanyRef.document(cardIndex).collection("cafeDiscount").document("스타벅스").set(makeSpecificDiscountInfo(discountAmount, discountRate, cashbackAmount, cashbackRate));
                cardCompanyRef.document(cardIndex).collection("cafeDiscount").document("빽다방").set(makeSpecificDiscountInfo(discountAmount, discountRate, cashbackAmount, cashbackRate));
                cardCompanyRef.document(cardIndex).collection("cafeDiscount").document("이디야").set(makeSpecificDiscountInfo(discountAmount, discountRate, cashbackAmount, cashbackRate));
                cardCompanyRef.document(cardIndex).collection("cafeDiscount").document("투썸플레이스").set(makeSpecificDiscountInfo(discountAmount, discountRate, cashbackAmount, cashbackRate));
                cardCompanyRef.document(cardIndex).collection("cafeDiscount").document("커피빈").set(makeSpecificDiscountInfo(discountAmount, discountRate, cashbackAmount, cashbackRate));
                break;
            case "convenientStoreDiscount":
                cardCompanyRef.document(cardIndex).collection("convenientStoreDiscount").document("CU").set(makeSpecificDiscountInfo(discountAmount, discountRate, cashbackAmount, cashbackRate));
                cardCompanyRef.document(cardIndex).collection("convenientStoreDiscount").document("세븐일레븐").set(makeSpecificDiscountInfo(discountAmount, discountRate, cashbackAmount, cashbackRate));
                cardCompanyRef.document(cardIndex).collection("convenientStoreDiscount").document("이마트24").set(makeSpecificDiscountInfo(discountAmount, discountRate, cashbackAmount, cashbackRate));
                cardCompanyRef.document(cardIndex).collection("convenientStoreDiscount").document("GS25").set(makeSpecificDiscountInfo(discountAmount, discountRate, cashbackAmount, cashbackRate));
                break;
            case "fastFoodDiscount":
                cardCompanyRef.document(cardIndex).collection("fastFoodDiscount").document("KFC").set(makeSpecificDiscountInfo(discountAmount, discountRate, cashbackAmount, cashbackRate));
                break;
            case "restaurantDiscount":
                cardCompanyRef.document(cardIndex).collection("restaurantDiscount").document("빕스").set(makeSpecificDiscountInfo(discountAmount, discountRate, cashbackAmount, cashbackRate));
                cardCompanyRef.document(cardIndex).collection("restaurantDiscount").document("아웃백").set(makeSpecificDiscountInfo(discountAmount, discountRate, cashbackAmount, cashbackRate));
                cardCompanyRef.document(cardIndex).collection("restaurantDiscount").document("계절밥상").set(makeSpecificDiscountInfo(discountAmount, discountRate, cashbackAmount, cashbackRate));
                break;
            case "theaterDiscount":
                cardCompanyRef.document(cardIndex).collection("theaterDiscount").document("CGV").set(makeSpecificDiscountInfo(discountAmount, discountRate, cashbackAmount, cashbackRate));
                cardCompanyRef.document(cardIndex).collection("theaterDiscount").document("메가박스").set(makeSpecificDiscountInfo(discountAmount, discountRate, cashbackAmount, cashbackRate));
                break;







        }
    }
    private void setSubCollections(
            CollectionReference cardCompanyRef, int num,
            boolean ifDiscountAmusementAll, boolean ifDiscountBakeryAll,
            boolean ifDiscountBookStoreAll, boolean ifDiscountCafeAll,
            boolean ifDiscountConvenientStoreAll, boolean ifDiscountFastFoodAll,
            boolean ifDiscountRestaurantAll, boolean ifDiscountTheaterAll,
            int amusementDiscountAmount, double amusementDiscountRate, int amusementCashbackAmount, double amusementCashbackRate,
            int bakeryDiscountAmount, double bakeryDiscountRate, int bakeryCashbackAmount, double bakeryCashbackRate,
            int bookStoreDiscountAmount, double bookStoreDiscountRate, int bookStoreCashbackAmount, double bookStoreCashbackRate,
            int cafeDiscountAmount, double cafeDiscountRate, int cafeCashbackAmount, double cafeCashbackRate,
            int convenientStoreDiscountAmount, double convenientStoreDiscountRate, int convenientStoreCashbackAmount, double convenientStoreCashbackRate,
            int fastFoodDiscountAmount, double fastFoodDiscountRate, int fastFoodCashbackAmount, double fastFoodCashbackRate,
            int restaurantDiscountAmount, double restaurantDiscountRate, int restaurantCashbackAmount, double restaurantCashbackRate,
            int theaterDiscountAmount, double theaterDiscountRate, int theaterCashbackAmount, double theaterCashbackRate) {


        String cardIndex = String.valueOf(num);
        if(ifDiscountAmusementAll == true) {setSubDocuments(cardCompanyRef, cardIndex,"amusementDiscount", amusementDiscountAmount, amusementDiscountRate, amusementCashbackAmount, amusementCashbackRate);}
        else{setSubDocuments(cardCompanyRef, cardIndex,"amusementDiscount", 0, 0.0, 0, 0.0);}

        if(ifDiscountBakeryAll == true) {setSubDocuments(cardCompanyRef, cardIndex,"bakeryDiscount", bakeryDiscountAmount, bakeryDiscountRate, bakeryCashbackAmount, bakeryCashbackRate);}
        else{setSubDocuments(cardCompanyRef, cardIndex,"bakeryDiscount", 0, 0.0, 0, 0.0);}

        if(ifDiscountBookStoreAll == true) {setSubDocuments(cardCompanyRef, cardIndex,"bookStoreDiscount", bookStoreDiscountAmount, bookStoreDiscountRate, bookStoreCashbackAmount, bookStoreCashbackRate);}
        else{setSubDocuments(cardCompanyRef, cardIndex,"bookStoreDiscount", 0, 0.0, 0, 0.0);}

        if(ifDiscountCafeAll == true) {setSubDocuments(cardCompanyRef, cardIndex,"cafeDiscount", cafeDiscountAmount, cafeDiscountRate, cafeCashbackAmount, cafeCashbackRate);}
        else{setSubDocuments(cardCompanyRef, cardIndex,"cafeDiscount", 0, 0.0, 0, 0.0);}

        if(ifDiscountConvenientStoreAll == true) {setSubDocuments(cardCompanyRef, cardIndex,"convenientStoreDiscount", convenientStoreDiscountAmount, convenientStoreDiscountRate, convenientStoreCashbackAmount, convenientStoreCashbackRate);}
        else{setSubDocuments(cardCompanyRef, cardIndex,"convenientStoreDiscount", 0, 0.0, 0, 0.0);}

        if(ifDiscountFastFoodAll == true) {setSubDocuments(cardCompanyRef, cardIndex,"fastFoodDiscount", fastFoodDiscountAmount, fastFoodDiscountRate, fastFoodCashbackAmount, fastFoodCashbackRate);}
        else{setSubDocuments(cardCompanyRef, cardIndex,"fastFoodDiscount", 0, 0.0, 0, 0.0);}

        if(ifDiscountRestaurantAll == true) {setSubDocuments(cardCompanyRef, cardIndex,"restaurantDiscount", restaurantDiscountAmount, restaurantDiscountRate, restaurantCashbackAmount, restaurantCashbackRate);}
        else{setSubDocuments(cardCompanyRef, cardIndex,"restaurantDiscount", 0, 0.0, 0, 0.0);}


        if(ifDiscountTheaterAll == true) {setSubDocuments(cardCompanyRef, cardIndex,"theaterDiscount", theaterDiscountAmount, theaterDiscountRate, theaterCashbackAmount, theaterCashbackRate);}
        else{setSubDocuments(cardCompanyRef, cardIndex,"theaterDiscount", 0, 0.0, 0, 0.0);}


    }




}