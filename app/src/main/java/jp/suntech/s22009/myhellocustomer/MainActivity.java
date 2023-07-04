package jp.suntech.s22009.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ボタン・オブジェクトの用意
        Button btClick = findViewById(R.id.btClick);
        //リスナ・オブジェクトの用意
        HelloListener listener = new HelloListener();
        //ボタンにリスナを設定
        btClick.setOnClickListener(listener);

        //お名前クリアボタンであるButtonオブジェクトを取得
        Button btName_clear = findViewById(R.id.btName_clear);
        //お名前クリアボタンにリスナを設定
        btName_clear.setOnClickListener(listener);

        //お住まいクリアボタンであるButtonオブジェクトを取得
        Button btHouse_clear = findViewById(R.id.btHouse_clear);
        //お住まいクリアボタンにリスナを設定
        btHouse_clear.setOnClickListener(listener);
    }
    private class HelloListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            //名前入力欄であるEditTextオブジェクトを取得
            EditText input = findViewById(R.id.etName);
            //住まい入力欄であるEditTextオブジェクトを取得
            EditText editText = findViewById(R.id.etHouse);
            //メッセージを表示するTextViewオブジェクト取得
            TextView output = findViewById(R.id.tvOutput);

            //タップされた画面部品のidのR値を取得
            int id = view.getId();

            if(id == R.id.btClick) {
                String inputStr = input.getText().toString();
                String inputStr_s = editText.getText().toString();
                output.setText(inputStr_s + "にお住まいの" + inputStr + "さん、こんにちは！");
            }else if(id == R.id.btName_clear) {
                input.setText("");
                output.setText("");
            }else if(id == R.id.btHouse_clear){
                editText.setText("");
                output.setText("");
            }

        }
    }
}