package com.kodilla.blackjack;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;

import java.util.ArrayList;

import java.util.Random;


public class KolkoKrzyzyk extends Application {

    public static int licznik;
    public static int zapiszGreLicznik;
    public static int numerGraczaKtoryWygral=0;
    public static String[]pustaZapiszGre=new String[9];

    public static void main(String[] args){
        launch(args);


    }




    public ArrayList<Button>pustaTablica(Button button,Button button1,Button button2,Button button3,Button button4,Button button5,Button button6,Button button7,Button button8){
        ArrayList<Button> pustaTablica= new ArrayList<>();
        if(button.getText().equals("")){
            pustaTablica.add(button);
        }
        if(button1.getText().equals("")){
            pustaTablica.add(button1);
        }
        if( button2.getText().equals("")){
            pustaTablica.add(button2);
        }
        if( button3.getText().equals("")){
            pustaTablica.add(button3);
        }
        if( button4.getText().equals("")){
            pustaTablica.add(button4);
        }
        if( button5.getText().equals("")){
            pustaTablica.add(button5);
        }
        if( button6.getText().equals("")){
            pustaTablica.add(button6);
        }
        if( button7.getText().equals("")){
            pustaTablica.add(button7);
        }
        if( button8.getText().equals("")){
            pustaTablica.add(button8);
        }

        return pustaTablica;

    }

     public void wygrales(Button button,Button button1,Button button2,Button button3,Button button4,Button button5,Button button6,Button button7,Button button8) {

         if (button.getText().equals("X") && button1.getText().equals("X") && button2.getText().equals("X")) {
             System.out.println("Wygrales");
             numerGraczaKtoryWygral=1;
             powiadomienieOZwyciestwie(button,button1,button2,button3,button4,button5,button6,button7,button8);
         } else if (button.getText().equals("O") && button1.getText().equals("O") && button2.getText().equals("O")){
             System.out.println("Wygrales");
             numerGraczaKtoryWygral=2;
             powiadomienieOZwyciestwie(button,button1,button2,button3,button4,button5,button6,button7,button8);

         }


          if(button3.getText().equals("X")&&button4.getText().equals("X")&&button5.getText().equals("X")) {
             System.out.println("Wygrales");
              numerGraczaKtoryWygral=1;
             powiadomienieOZwyciestwie(button,button1,button2,button3,button4,button5,button6,button7,button8);

          }
         else if(button3.getText().equals("O")&&button4.getText().equals("O")&&button5.getText().equals("O")) {
             System.out.println("Wygrales");
             numerGraczaKtoryWygral=2;
             powiadomienieOZwyciestwie(button,button1,button2,button3,button4,button5,button6,button7,button8);

         }
         if(button6.getText().equals("X")&&button7.getText().equals("X")&&button8.getText().equals("X")) {
             System.out.println("Wygrales");
             numerGraczaKtoryWygral=1;
             powiadomienieOZwyciestwie(button,button1,button2,button3,button4,button5,button6,button7,button8);

         }
         else if(button6.getText().equals("O")&&button7.getText().equals("O")&&button8.getText().equals("O")) {
             System.out.println("Wygrales");

             numerGraczaKtoryWygral=2;
             powiadomienieOZwyciestwie(button,button1,button2,button3,button4,button5,button6,button7,button8);

         }

         if(button.getText().equals("X")&&button3.getText().equals("X")&&button6.getText().equals("X")) {
             System.out.println("Wygrales");
             numerGraczaKtoryWygral=1;
             powiadomienieOZwyciestwie(button,button1,button2,button3,button4,button5,button6,button7,button8);

         }
         else if(button.getText().equals("O")&&button3.getText().equals("O")&&button6.getText().equals("O")) {
             System.out.println("Wygrales");
             numerGraczaKtoryWygral=2;
             powiadomienieOZwyciestwie(button,button1,button2,button3,button4,button5,button6,button7,button8);

         }

         if(button1.getText().equals("X")&&button4.getText().equals("X")&&button7.getText().equals("X")) {
             System.out.println("Wygrales");

             numerGraczaKtoryWygral=1;
             powiadomienieOZwyciestwie(button,button1,button2,button3,button4,button5,button6,button7,button8);

         }
         else if(button1.getText().equals("O")&&button4.getText().equals("O")&&button7.getText().equals("O")) {
             System.out.println("Wygrales");
             numerGraczaKtoryWygral=2;
             powiadomienieOZwyciestwie(button,button1,button2,button3,button4,button5,button6,button7,button8);

         }

         if(button2.getText().equals("X")&&button5.getText().equals("X")&&button8.getText().equals("X")) {
             System.out.println("Wygrales");
             numerGraczaKtoryWygral=1;
             powiadomienieOZwyciestwie(button,button1,button2,button3,button4,button5,button6,button7,button8);

         }
         else if(button2.getText().equals("O")&&button5.getText().equals("O")&&button8.getText().equals("O")) {
             System.out.println("Wygrales");
             numerGraczaKtoryWygral=2;
             powiadomienieOZwyciestwie(button,button1,button2,button3,button4,button5,button6,button7,button8);
            
         }
     }

     public Button miejsceNaTarczy(ArrayList<Button> tablicaPustychButtonow){
       // tablicaPustychButtonow.size();
         Random generatorLiczb = new Random();
         return tablicaPustychButtonow.get(generatorLiczb.nextInt(tablicaPustychButtonow.size()));
     }

    public void wyswietlZnak( Button button, Button button1,Button button2,Button button3,Button button4,Button button5,Button button6,Button button7,Button button8,int i ){


        if(licznik%2==0&&!button.getText().equals("X")&&!button.getText().equals("O")) {
            button.setText("X");
            licznik++;
        }
        if (licznik%2==1&&licznik<9) {
           miejsceNaTarczy(pustaTablica(button,button1,button2,button3,button4,button5,button6,button7,button8)).setText("O");

            licznik++;
        }

        System.out.println(licznik);

        System.out.println(licznik);
    }
        public void powiadomienieOZwyciestwie(Button button,Button button1,Button button2,Button button3,Button button4,Button button5,Button button6,Button button7,Button button8){
            if(OkienkoWygrales.okienkoWygrales(numerGraczaKtoryWygral).isPresent()&&OkienkoWygrales.okienkoWygrales(numerGraczaKtoryWygral).get()==ButtonType.OK){

                button.setText("");
                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                licznik=0;
                numerGraczaKtoryWygral=0;


            }


        }

    @Override
    public void start(Stage primaryStage) throws Exception {



            licznik=0;
            zapiszGreLicznik=0;

            Button button = new Button();
            Button button1 = new Button();
            Button button2 = new Button();
            Button button3 = new Button();
            Button button4 = new Button();
            Button button5 = new Button();
            Button button6 = new Button();
            Button button7 = new Button();
            Button button8 = new Button();
            Button nowaGra = new Button("Nowa Gra");
            Button zapiszGre= new Button("Zapisz Gre");
            Button wczytajOstatnieRozdanie = new Button("Wczytaj ostatnie rozdanie");
            button.setStyle("-fx-font-size: 20");
            button1.setStyle("-fx-font-size: 20");
            button2.setStyle("-fx-font-size: 20");
            button3.setStyle("-fx-font-size: 20");
            button4.setStyle("-fx-font-size: 20");
            button5.setStyle("-fx-font-size: 20");
            button6.setStyle("-fx-font-size: 20");
            button7.setStyle("-fx-font-size: 20");
            button8.setStyle("-fx-font-size: 20");







                  button.setOnAction((e) -> {
                        wyswietlZnak(button,button1,button2,button3,button4,button5,button6,button7,button8,4);
                        wygrales(button,button1,button2,button3,button4,button5,button6,button7,button8);

                    });
                   button1.setOnAction((e) -> {
                        wyswietlZnak(button1,button,button2,button3,button4,button5,button6,button7,button8, 4);
                        wygrales(button,button1,button2,button3,button4,button5,button6,button7,button8);
                    });

                    button2.setOnAction((e) -> {
                        wyswietlZnak(button2,button,button1,button3,button4,button5,button6,button7,button8, 4);
                        wygrales(button,button1,button2,button3,button4,button5,button6,button7,button8);
                    });

                    button3.setOnAction((e) -> {
                        wyswietlZnak(button3,button,button1,button2,button4,button5,button6,button7,button8, 4);
                        wygrales(button,button1,button2,button3,button4,button5,button6,button7,button8);
                    });

                    button4.setOnAction((e) -> {
                        wyswietlZnak(button4,button,button1,button2,button3,button5,button6,button7,button8, 4);
                        wygrales(button,button1,button2,button3,button4,button5,button6,button7,button8);
                    });

                    button5.setOnAction((e) -> {
                        wyswietlZnak(button5,button,button1,button2,button3,button4,button6,button7,button8, 4);
                        wygrales(button,button1,button2,button3,button4,button5,button6,button7,button8);
                    });



                    button6.setOnAction((e) -> {
                        wyswietlZnak(button6,button,button1,button2,button3,button4,button5,button7,button8, 4);
                        wygrales(button,button1,button2,button3,button4,button5,button6,button7,button8);
                    });


                    button7.setOnAction((e) -> {
                        wyswietlZnak(button7,button,button1,button2,button3,button4,button5,button6,button8, 4);
                        wygrales(button,button1,button2,button3,button4,button5,button6,button7,button8);
                    });

                    button8.setOnAction((e) -> {
                        wyswietlZnak(button8,button,button1,button2,button3,button4,button5,button6,button7, 4);
                        wygrales(button,button1,button2,button3,button4,button5,button6,button7,button8);
                    });

                    nowaGra.setOnAction((e) -> {
                       button.setText("");
                       button1.setText("");
                       button2.setText("");
                       button3.setText("");
                       button4.setText("");
                       button5.setText("");
                       button6.setText("");
                       button7.setText("");
                       button8.setText("");
                       licznik=0;
                    });



                    zapiszGre.setOnAction((e) -> {




                            pustaZapiszGre[0]=button.getText();
                            pustaZapiszGre[1]=button1.getText();
                            pustaZapiszGre[2]=button2.getText();
                            pustaZapiszGre[3]=button3.getText();
                            pustaZapiszGre[4]=button4.getText();
                            pustaZapiszGre[5]=button5.getText();
                            pustaZapiszGre[6]=button6.getText();
                            pustaZapiszGre[7]=button7.getText();
                            pustaZapiszGre[8]=button8.getText();
                            zapiszGreLicznik=licznik;


                        for(int i =0; i<9;i++){
                            System.out.println(pustaZapiszGre[i]);

                        }


                             System.out.println(pustaZapiszGre.length);
                    });

                           wczytajOstatnieRozdanie.setOnAction((e) -> {

                              for(int i =0; i<9;i++){
                                  System.out.println(pustaZapiszGre[i]);
                              }
                              licznik=zapiszGreLicznik;
                              zapiszGreLicznik=0;
                           button.setText(pustaZapiszGre[0]);
                           button1.setText(pustaZapiszGre[1]);
                           button2.setText(pustaZapiszGre[2]);
                           button3.setText(pustaZapiszGre[3]);
                           button4.setText(pustaZapiszGre[4]);
                           button5.setText(pustaZapiszGre[5]);
                           button6.setText(pustaZapiszGre[6]);
                           button7.setText(pustaZapiszGre[7]);
                           button8.setText(pustaZapiszGre[8]);


                    });

        GridPane grid = new GridPane();
        ColumnConstraints column1 = new ColumnConstraints();
        ColumnConstraints column2 = new ColumnConstraints();
        ColumnConstraints column3 = new ColumnConstraints();
        column1.setPercentWidth(33);
        column2.setPercentWidth(33);
        column3.setPercentWidth(33);
        grid.getColumnConstraints().addAll(column1,column2,column3);
        grid.setGridLinesVisible(true);


        button.setPrefSize(600,300);
        button1.setPrefSize(600,300);
        button2.setPrefSize(600,300);
        button3.setPrefSize(600,300);
        button4.setPrefSize(600,300);
        button5.setPrefSize(600,300);
        button6.setPrefSize(600,300);
        button7.setPrefSize(600,300);
        button8.setPrefSize(600,300);

        nowaGra.setPrefSize(900,300);
        zapiszGre.setPrefSize(900,300);
        wczytajOstatnieRozdanie.setPrefSize(900,300);



        grid.add(button,0,0);
        grid.add(button1,1,0);
        grid.add(button2,2,0);
        grid.add(button3,0,1);
        grid.add(button4,1,1);
        grid.add(button5,2,1);
        grid.add(button6,0,2);
        grid.add(button7,1,2);
        grid.add(button8,2,2);
        grid.add(nowaGra,0,3);
        grid.add(zapiszGre,1,3);
        grid.add(wczytajOstatnieRozdanie,2,3);
        Scene scene = new Scene(grid,800,900);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Gra w Kolko i Krzyżyk");
        primaryStage.show();

    }

}
