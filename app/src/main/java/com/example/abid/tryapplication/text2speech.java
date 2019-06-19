package com.example.abid.tryapplication;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.AsyncTask;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Locale;
import android.util.Log;
import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;



public class text2speech extends Activity implements TextToSpeech.OnInitListener {

        private TextToSpeech tts;
        private Button btnSpeak;
        private TextView txtText;
        private TextView tv2;
        private static final String API_KEY = "AIzaSyA0TCUEYgZ_iD6NI2Wl4N0Q11XLz6tl6Ew";

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_text2speech);

            tts = new TextToSpeech(this, this);

            tv2  = (TextView)findViewById(R.id.TranslateView);
            Intent i = getIntent();
            final String s1 = i.getStringExtra("output");
            txtText = (TextView)findViewById(R.id.textView);
            txtText.setText(s1);
            final Handler textViewHandler = new Handler();
            new AsyncTask<Void, Void, Void>() {
                @Override
                protected Void doInBackground(Void... params)
                {
                    TranslateOptions options = TranslateOptions.newBuilder().setApiKey(API_KEY).build();
                    Translate translate = options.getService();
                    final Translation translation = translate.translate(s1,Translate.TranslateOption.targetLanguage("hi"));
                    textViewHandler.post(new Runnable() {
                        @Override
                        public void run()
                        {
                            if (tv2 != null) {
                                tv2.setText(translation.getTranslatedText());
                                txtText.setText(s1);
                            }
                        }
                    });
                    return null;
                }
            }.execute();

            btnSpeak = (Button) findViewById(R.id.button2);



            // button on click event
            btnSpeak.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    speakOut();
                }

            });
        }

        @Override
        public void onDestroy() {
            // Don't forget to shutdown tts!
            if (tts != null) {
                tts.stop();
                tts.shutdown();
            }
            super.onDestroy();
        }

        @Override
        public void onInit(int status) {

            if (status == TextToSpeech.SUCCESS) {

                int result = tts.setLanguage(new Locale("hi"));

                if (result == TextToSpeech.LANG_MISSING_DATA
                        || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Log.e("TTS", "This Language is not supported");
                } else {
                    btnSpeak.setEnabled(true);
                    speakOut();
                }

            } else {
                Log.e("TTS", "Initilization Failed!");
            }

        }

    private void speakOut() {

        String text = tv2.getText().toString();

        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }
}




