package kosulluİfadeler;
import java.util.Scanner;

public class kosulluİfade {
    public static void main(String[] args) {
        //Hesap Makinesi Programı-pratik1
     /*   Scanner input=new Scanner(System.in);
        double sayi1,sayi2;
     sayi1=input.nextDouble();
     System.out.print("ikinci sayıyı giriniz:");
     sayi2=input.nextDouble();
     System.out.print("Yapılacak işlemi seçiniz: 1-Toplama 2-Çıkarma 3-Bölme 4-Çarpma: " );
     int secim=input.nextInt();

     switch (secim){
       case 1:
           System.out.print("Toplamayı Seçtiniz.Sonuç: "+(sayi1+sayi2));
           break;
       case 2:
           System.out.print("Çıkarmayı Seçtiniz.Sonuç: "+(sayi1-sayi2));
           break;
       case 3:
           System.out.print("Bölmeyi Seçtiniz.Sonuç: "+(sayi1/sayi2));
           break;
       case 4:
           System.out.print("Çarpma Seçtiniz.Sonuç: "+(sayi1*sayi2));
           break;
       default:
           System.out.print("Seçim yapmadınız");
           break;  */



        //Kullanıcı Giriş-pratik2
      /*  String kullaniciAdi="hatice", sifre="1234";
        Scanner deger=new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz: ");
        kullaniciAdi= deger.nextLine();
        System.out.print("Şifreyi Giriniz: ");
        sifre= deger.nextLine();

        if (kullaniciAdi.equals("hatice")&&sifre.equals("1234")) {
            System.out.print("Giriş Başarılı.");
        }
        else if (sifre!="1234")
        {
            System.out.print("Şifreyi sıfırlamak ister misiniz? 1-evet 2-hayır: ");
            int secim= deger.nextInt();
            if(secim==1)
            {
                System.out.print("Yeni şifre giriniz: ");
                String yeniSifre= deger.next();
                if(yeniSifre.equals("1234"))
                {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    System.out.print("Yeni şifre giriniz: ");
                    String yeniSifre2= deger.next();
                } else if (sifre!=yeniSifre) {
                    System.out.print("Şifre oluşturuldu");
                }

            } else if (secim==2) {
                System.out.print("Şifreyi sıfırlamak istemediniz.!");

            }
            else{
                System.out.print("Geçersiz seçim yaptınız!");
            }
        } */

        //Hava Sıcaklığına Göre Etkinlik Önerme-pratik4
           /*Scanner input=new Scanner(System.in);
           System.out.print("Sıcaklık giriniz: ");
           int sicaklik=input.nextInt();

           if(sicaklik<5)
           {
               System.out.print("Kayak yapabilirsiniz");
           } else if (sicaklik>=5 && sicaklik<=15) {
               System.out.print("Sinemaya gidebilirsiniz.");
           }else if (sicaklik>15 && sicaklik<=25) {
               System.out.print("Pikniğe gidebilirsiniz.");
           }else if (sicaklik>25 ) {
               System.out.print("Yüzmeye gidebilirsiniz.");
           } */


        //Sayıları Büyükten Küçüğe Sıralama-pratik5
        /* Scanner deger=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi1=deger.nextInt();
        System.out.print("Bir sayı giriniz: ");
        int sayi2=deger.nextInt();
        System.out.print("Bir sayı giriniz: ");
        int sayi3=deger.nextInt();

        if(sayi1>sayi2 )
        {
            if(sayi1>sayi3)
            {
                if (sayi2>sayi3)
                {
                    System.out.print(sayi1+">"+sayi2+">"+sayi3);
                } else if (sayi3>sayi2) {
                    System.out.print(sayi1+">"+sayi3+">"+sayi2);
                }
            } else if (sayi3>sayi1) {
                if(sayi2>sayi3){
                    System.out.print(sayi2+">"+sayi3+">"+sayi1);
                } else if (sayi3>sayi2) {
                    System.out.print(sayi3+">"+sayi2+">"+sayi1);

                }
            }
        } else if (sayi2>sayi1) {
            if (sayi1>sayi3){
                if (sayi2>sayi3){
                    System.out.print(sayi2+">"+sayi1+">"+sayi3);
                }
                if (sayi3>sayi2){
                    System.out.print(sayi3+">"+sayi1+">"+sayi2);

                }
            } else if (sayi3>sayi1) {
                if (sayi2>sayi3){
                    System.out.print(sayi2+">"+sayi3+">"+sayi1);
                } else if (sayi3>sayi2) {
                    System.out.print(sayi3+">"+sayi2+">"+sayi1);
                }
            }
        } */

        //Burç hesaplama-pratik6
    /*   Scanner input =new Scanner(System.in);
        String ay1="ocak",ay2="şubat",ay3="mart",ay4="nisan",ay5="mayıs",ay6="haziran",ay7="temmuz",ay8="ağustos",ay9="eylül",
                ay10="ekim",ay11="kasım" ,ay12="aralık";

        System.out.print("Doğum ayınızı giriniz:");
        String dogumAy= input.nextLine();
        System.out.print("Doğum gününüzü giriniz:");
        int dogumGün= input.nextInt();

        if(dogumAy.equals(ay1))
        {
            if(dogumGün<21&& dogumGün>=1)
            {
                System.out.print("Oğlak burcu");
            } else if (dogumGün>=22&&dogumGün<=31) {
                System.out.print("Kova burcu");
            }
        } else if (dogumAy.equals(ay2)) {
            if (dogumGün>=1||dogumGün<=19){
                System.out.print("Kova burcu");
            } else if (dogumGün==20) {
                System.out.print("Balık burcu");
            }

        } else if (dogumAy.equals(ay3)) {
            if (dogumGün<=20)
            {
                System.out.print("Balık burcu");
            } else if (dogumGün>=21||dogumGün<=31) {
                System.out.print("Koç burcu");
            }
        }else if (dogumAy.equals(ay4)) {
            if (dogumGün>=1||dogumGün<=20){
                System.out.print("Koç burcu");
            } else if (dogumGün>=21) {
                System.out.print("Boğa burcu");
            }
        }
        else if (dogumAy.equals(ay5)) {
            if(dogumGün<=21){
                System.out.print("Boğa burcu");
            } else if (dogumGün>=22){
                System.out.print("ikizler burcu");

            }
        } else if (dogumAy.equals(ay6)) {
            if (dogumGün<=22){
                System.out.print("İkizler burcu");
            } else if (dogumGün>=23) {
                System.out.print("Yengeç burcu");
            }

        }else if (dogumAy.equals(ay7)) {
            if (dogumGün<=22){
                System.out.print("yengeç burcu");
            } else if (dogumGün>=23) {
                System.out.print("Aslan burcu");
            }

        }else if (dogumAy.equals(ay8)) {
            if (dogumGün<=22){
                System.out.print("Aslan burcu");
            } else if (dogumGün>=23) {
                System.out.print("Başak burcu");
            }

        }else if (dogumAy.equals(ay9)) {
            if (dogumGün<=22){
                System.out.print("Başak burcu");
            } else if (dogumGün>=23) {
                System.out.print("Terazi burcu");
            }

        }else if (dogumAy.equals(ay10)) {
            if (dogumGün<=22){
                System.out.print("terazi burcu");
            } else if (dogumGün>=23) {
                System.out.print("Akrep burcu");
            }

        }else if (dogumAy.equals(ay11)) {
            if (dogumGün<=21){
                System.out.print("Akrep burcu");
            } else if (dogumGün>=22) {
                System.out.print("Yay burcu");
            }

        }else if (dogumAy.equals(ay12)) {
            if (dogumGün<=21){
                System.out.print("Yay burcu");
            } else if (dogumGün>=22) {
                System.out.print("Oğlak burcu");
            }

        }*/

        //Ödev - Çin Zodyağı Hesaplama
     /*   Scanner input=new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        int dogumYil= input.nextInt();
        int deger=dogumYil%12;
        if(deger==0){
            System.out.print("Çin Zodyağı Burcunuz:Maymun");
        } else if (deger==1) {
            System.out.print("Çin Zodyağı Burcunuz:Horoz");

        }else if (deger==2) {
            System.out.print("Çin Zodyağı Burcunuz:Köpek");

        }else if (deger==3) {
            System.out.print("Çin Zodyağı Burcunuz:Domuz");

        }else if (deger==4) {
            System.out.print("Çin Zodyağı Burcunuz:Fare");

        }else if (deger==5) {
            System.out.print("Çin Zodyağı Burcunuz:Öküz");

        }else if (deger==6) {
            System.out.print("Çin Zodyağı Burcunuz:Kaplan");

        }else if (deger==7) {
            System.out.print("Çin Zodyağı Burcunuz:Tavşan");

        }else if (deger==8) {
            System.out.print("Çin Zodyağı Burcunuz:Ejderha");

        }else if (deger==9) {
            System.out.print("Çin Zodyağı Burcunuz:Yılan");

        }else if (deger==10) {
            System.out.print("Çin Zodyağı Burcunuz:At");

        }else if (deger==11) {
            System.out.print("Çin Zodyağı Burcunuz:Koyun");

        }*/


        //Ödev3 - Artık YIl Hesaplama
     /*   Scanner input =new Scanner(System.in);
        System.out.print("Yıl giriniz:");
        int yil=input.nextInt();
       int deger= yil%4;

       if(yil%100==0)
       {
           if(yil%400==0){
               System.out.print(yil+" yılı artık yıldır");
           }
           else {
               System.out.print(yil+" yılı artık yıl değildir");
           }
       }else {
           if (deger == 0) {

               System.out.print(yil + " yılı artık yıldır");

           } else {
               System.out.print(yil + " yılı artık yıl değildir");
           }
       }  */


        //Ödev - Uçak Bileti Fiyatı Hesaplama
     /*   Scanner input=new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        double mesafeKm =input.nextDouble();
        System.out.print("Yaşınızı giriniz: ");
        int yas =input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int secenek =input.nextInt();
        double normalTutar=mesafeKm*0.10;
        double toplamTutar,yasİndirimi,yasİndirimOrani,indirimliTutar,gidisDönüsİndirimi;

         if(mesafeKm>0 && yas>0&& secenek==1||secenek==2)
         { if (secenek==1){
             if(yas<12)
             {   yasİndirimOrani=0.50;
                 yasİndirimi=normalTutar*yasİndirimOrani;
                 indirimliTutar=normalTutar-yasİndirimi;
                System.out.print(indirimliTutar);
             } else if (yas>12&&yas<24) {
                 yasİndirimOrani=0.10;
                 yasİndirimi=normalTutar*yasİndirimOrani;
                 indirimliTutar=normalTutar-yasİndirimi;
                 System.out.print(indirimliTutar);
             } else if (yas>=24&&yas<65) {

                 System.out.print(normalTutar);

             } else if (yas>65) {
                 yasİndirimOrani=0.30;
                 yasİndirimi=normalTutar*yasİndirimOrani;
                 indirimliTutar=normalTutar-yasİndirimi;
                 System.out.print(indirimliTutar);
             }
         } else if (secenek==2) {
             if(yas<12)
         {   yasİndirimOrani=0.50;
             yasİndirimi=normalTutar*yasİndirimOrani;
             indirimliTutar=normalTutar-yasİndirimi;
             gidisDönüsİndirimi=indirimliTutar*0.20;
             toplamTutar=(indirimliTutar-gidisDönüsİndirimi)*2;
             System.out.print(toplamTutar);
         } else if (yas>12&&yas<24) {
             yasİndirimOrani=0.10;
             yasİndirimi=normalTutar*yasİndirimOrani;
             indirimliTutar=normalTutar-yasİndirimi;
                 gidisDönüsİndirimi=indirimliTutar*0.20;
                 toplamTutar=(indirimliTutar-gidisDönüsİndirimi)*2;
                 System.out.print(toplamTutar);
         } else if (yas>=24&&yas<65) {
                 gidisDönüsİndirimi=normalTutar*0.20;
                 toplamTutar=(normalTutar-gidisDönüsİndirimi)*2;

             System.out.print(toplamTutar);

         } else if (yas>65) {
             yasİndirimOrani=0.30;
             yasİndirimi=normalTutar*yasİndirimOrani;
             indirimliTutar=normalTutar-yasİndirimi;
                 gidisDönüsİndirimi=indirimliTutar*0.20;
                 toplamTutar=(indirimliTutar-gidisDönüsİndirimi)*2;
                 System.out.print(toplamTutar);
         }

         }


         }else {
             System.out.print("Hatalı veri girdiniz!");
         } */


    }
}
