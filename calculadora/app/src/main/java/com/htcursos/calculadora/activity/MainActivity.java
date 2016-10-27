package com.htcursos.calculadora.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.htcursos.calculadora.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlos on 25/10/2016.
 */

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button num0 = (Button) findViewById(R.id.num00);
        final Button num1 = (Button) findViewById(R.id.num01);
        final Button num2 = (Button) findViewById(R.id.num02);
        final Button num3 = (Button) findViewById(R.id.num03);
        final Button num4 = (Button) findViewById(R.id.num04);
        final Button num5 = (Button) findViewById(R.id.num05);
        final Button num6 = (Button) findViewById(R.id.num06);
        final Button num7 = (Button) findViewById(R.id.num07);
        final Button num8 = (Button) findViewById(R.id.num08);
        final Button num9 = (Button) findViewById(R.id.num09);
        final Button soma = (Button) findViewById(R.id.soma);
        final Button subtr = (Button) findViewById(R.id.subtr);
        final Button mult = (Button) findViewById(R.id.mult);
        final Button divisao = (Button) findViewById(R.id.divisao);
        final Button ponto = (Button) findViewById(R.id.ponto);
        final Button resultado = (Button) findViewById(R.id.igual);
        final Button clear = (Button) findViewById(R.id.clear);
        final TextView title = (TextView) findViewById(R.id.campo_num);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title.setText("");
            }
        });

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = title.getText().toString();

                if(txt.equalsIgnoreCase("ERRO")){
                    title.setText(num0.getText().toString());
                }else {
                    txt = txt + num0.getText().toString();
                    title.setText(txt);
                }
            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = title.getText().toString();

                if(txt.equalsIgnoreCase("ERRO")){
                    title.setText(num1.getText().toString());
                }else {
                    txt = txt + num1.getText().toString();
                    title.setText(txt);
                }
            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = title.getText().toString();

                if(txt.equalsIgnoreCase("ERRO")){
                    title.setText(num2.getText().toString());
                }else {
                    txt = txt + num2.getText().toString();
                    title.setText(txt);
                }
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = title.getText().toString();

                if(txt.equalsIgnoreCase("ERRO")){
                    title.setText(num3.getText().toString());
                }else {
                    txt = txt + num3.getText().toString();
                    title.setText(txt);
                }
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = title.getText().toString();

                if(txt.equalsIgnoreCase("ERRO")){
                    title.setText(num4.getText().toString());
                }else {
                    txt = txt + num4.getText().toString();
                    title.setText(txt);
                }
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = title.getText().toString();

                if(txt.equalsIgnoreCase("ERRO")){
                    title.setText(num5.getText().toString());
                }else {
                    txt = txt + num5.getText().toString();
                    title.setText(txt);
                }
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = title.getText().toString();

                if(txt.equalsIgnoreCase("ERRO")){
                    title.setText(num6.getText().toString());
                }else {
                    txt = txt + num6.getText().toString();
                    title.setText(txt);
                }
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = title.getText().toString();

                if(txt.equalsIgnoreCase("ERRO")){
                    title.setText(num7.getText().toString());
                }else {
                    txt = txt + num7.getText().toString();
                    title.setText(txt);
                }
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = title.getText().toString();

                if(txt.equalsIgnoreCase("ERRO")){
                    title.setText(num8.getText().toString());
                }else {
                    txt = txt + num8.getText().toString();
                    title.setText(txt);
                }
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = title.getText().toString();

                if(txt.equalsIgnoreCase("ERRO")){
                    title.setText(num9.getText().toString());
                }else {
                    txt = txt + num9.getText().toString();
                    title.setText(txt);
                }
            }
        });

        ponto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = title.getText().toString();

                if(txt.equalsIgnoreCase("ERRO")){
                    title.setText(ponto.getText().toString());
                }else {
                    txt = txt + ponto.getText().toString();
                    title.setText(txt);
                }
            }
        });

        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = title.getText().toString();

                if(txt.equalsIgnoreCase("ERRO")){
                    title.setText(soma.getText().toString());
                }else {
                    txt = txt + soma.getText().toString();
                    title.setText(txt);
                }
            }
        });

        subtr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = title.getText().toString();

                if(txt.equalsIgnoreCase("ERRO")){
                    title.setText(subtr.getText().toString());
                }else {
                    txt = txt + subtr.getText().toString();
                    title.setText(txt);
                }
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = title.getText().toString();

                if(txt.equalsIgnoreCase("ERRO")){
                    title.setText(mult.getText().toString());
                }else {
                    txt = txt + mult.getText().toString();
                    title.setText(txt);
                }
            }
        });

        divisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = title.getText().toString();

                if(txt.equalsIgnoreCase("ERRO")){
                    title.setText(divisao.getText().toString());
                }else {
                    txt = txt + divisao.getText().toString();
                    title.setText(txt);
                }
            }
        });

        resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String equacao = title.getText().toString();   //PEGA A STRING

                char[] c = equacao.toCharArray();
                boolean eqcValida = true;

                //INICIO DOS TESTES DE ERRO
                if(Character.isDigit(c[0]) && Character.isDigit(c[c.length-1])){
                    int cont = 0;
                    for(int i = 1;i < c.length ;i ++){    //INICIA NO 2° CARACTERE c[1].
                        if( (!Character.isDigit(c[i]) && !Character.isDigit(c[i - 1])) || (cont > 1) ){
                            eqcValida = false;
                            break;
                        }else if(!Character.isDigit(c[i]) && c[i] != '.'){  //SE ENCONTRAR UMA OPERACAO , ZERA CONT .
                            cont = 0;
                        }

                        if(c[i] == '.'){  //CONTADOR DE QNTS POTOS HA ANTES DE UMA OPERACAO .
                            cont++;
                        }
                    }
                }else{
                    eqcValida = false;
                }
                //FIM DOS TESTES

                if(eqcValida){
                    List<Double> eq = new ArrayList<Double>();
                    String numero = "" ;
                    double aux = 0 , result = 0 ;

                    //COLOCA A STRING EQUACAO EM UMA LISTA E SEPARADA POR SINAL E NUMERO E DEPOIS JOGA NUM VETOR .
                    for(int i = 0 ; i < equacao.length() ; i++){
                        if(Character.isDigit( c[ i ] ) || c[i] == '.'){
                            numero = numero.concat(Character.toString(c[i]));
                        }else{
                            eq.add(Double.parseDouble(numero));
                            numero = "";
                            if(c[i] == 'x'){
                                eq.add(1d);
                            }else if(c[i] == '/'){
                                eq.add(2d);
                            }else if(c[i] == '+'){
                                eq.add(3d);
                            }else if(c[i] == '-'){
                                eq.add(4d);
                            }
                        }
                    }
                    eq.add(Double.parseDouble(numero));
                    Double []eqc = eq.toArray(new Double[0]); //TIPO DO VETOR -> |NUM|OPERACAO|NUM|OPERACO|NUM|OPERACAO|
                    //FIM SEPARACAO

                    aux = eqc[0];
                    result = eqc[2];
                    double num01 , num02 ;
                    int i = 1 ;             //CAMINHA PELO VETOR .
                    int qntddSalto = 0;
                    boolean salto = false ;
                    boolean ctrl = true ;

                    while(i < eqc.length){      //CALCULO DA EQUCAO .
                        num01 = aux;
                        num02 = result;

                        if(i+2 < eqc.length){       //VERIFICA SE A PROX OPERACAO TEM PRIORIDADE E ANT É != DE PRIORIDADE .
                            if( (eqc[i + 2] == 1d || eqc[i + 2] == 2d) && (eqc[i] != 1d && eqc[i] != 2d) ){
                                ctrl = false;
                            }
                        }

                        if(ctrl || salto){

                            if(eqc[i] == 1d){
                                result = num01 * num02;
                            }else if(eqc[i] == 2d){
                                result = num01 / num02;
                            }else if(eqc[i] == 3d){
                                result = num01 + num02;
                            }else if(eqc[i] == 4d){
                                result = num01 - num02;
                            }
                            aux = result ;
                            if(i + 2 + qntddSalto < eqc.length){
                                result = eqc[i + 3 + qntddSalto];
                                salto = false;
                                ctrl = true;
                            }
                            i = i + 2 + qntddSalto;
                            qntddSalto = 0;

                        }else{
                            int priorit = i + 2;

                            do{
                                num01 = result ;
                                num02 = eqc[priorit+1];

                                if(eqc[priorit] == 1d){
                                    result = num01 * num02;
                                }else if(eqc[priorit] == 2d){
                                    result = num01 / num02;
                                }

                                priorit = priorit + 2;
                                salto = true;
                                qntddSalto = qntddSalto + 2;
                                if(priorit >= eqc.length){
                                    break;
                                }
                                if(eqc[priorit] == 3d || eqc[priorit] == 4d){
                                    break;
                                }
                            }while(true);
                        }
                    }
                    title.setText(String.valueOf(aux));
                }else{
                    title.setText("ERRO");
                }
            }
        });

    }
}
