package com.jyoty.tempdel;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//3.Implement Click listener


    public class TempDelAct extends Activity implements View.OnClickListener{

        //1. define objects
        private Button buttonHello;
        private TextView textViewHello;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_temp_del);

            //2. links xml object to java object
            buttonHello = (Button) findViewById(R.id.buttonHello);
            textViewHello = (TextView) findViewById(R.id.textViewHello);


            //4. Activate click on my button
            buttonHello.setOnClickListener(this);

        }
        // 5. Implement Listener
        public void onClick (View view)
        {
            textViewHello.setText("You clicked here");
    }
}
