package my.pointofsale.kenyaforestservice;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Printer;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener,SmsAdapter.OnItemClickListerner {

 WebView webView;
 private Printer mPrinter;
 OutputStream outputStream;
 InputStream inputStream;
 Thread thread;
 private  boolean btthreadrunning = false;
 private boolean bloop = false;

 byte[] readBuffer;
 int readBufferPosition;
 volatile  boolean stopWorker;
 Button btnprint;
 String smsToReprint;
 Boolean reprintSms;
 private Bundle b;

       @Override
public  void  onBackPressed(){
       if (webView.canGoBack()){
        webView.goBack();
       } else {
        super.onBackPressed();
       }
       }
       private static MainActivity inst;
       ArrayList<String> smsMessageList = new ArrayList<>();
       ArrayList<String> smsBodyList = new ArrayList<>();

