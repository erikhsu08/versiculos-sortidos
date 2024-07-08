package com.versiculossortidos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarVersiculo(View view){
        String[] versiculos = {
                "Josué 1:9 - NVI\nNão fui eu que ordenei a você? Seja forte e corajoso! Não se apavore nem desanime, pois o Senhor, o seu Deus, estará com você por onde você andar.",
                "João 16:33 - NVI\n\"Eu disse essas coisas para que em mim vocês tenham paz. Neste mundo vocês terão aflições; contudo, tenham ânimo! Eu venci o mundo\".",
                "João 3:16 - NVI\n\"Porque Deus tanto amou o mundo que deu o seu Filho Unigênito, para que todo o que nele crer não pereça, mas tenha a vida eterna\".",
                "Mateus 22 37-40 - NVI\nRespondeu Jesus: \" ‘Ame o Senhor, o seu Deus de todo o seu coração, de toda a sua alma e de todo o seu entendimento’. Este é o primeiro e maior mandamento. E o segundo é semelhante a ele: ‘Ame o seu próximo como a si mesmo’. Destes dois mandamentos dependem toda a Lei e os Profetas\"."
        };

        int num = new Random().nextInt(4);
        TextView versiculo = findViewById(R.id.textVersiculo);
        versiculo.setText(versiculos[num]);
    }

}