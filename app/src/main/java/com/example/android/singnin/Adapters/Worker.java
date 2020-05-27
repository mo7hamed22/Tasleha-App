package com.example.android.singnin.Adapters;

public class Worker {
    private String category;
    //private int img_category;
    private String fixedServece ;
    private String ss;

    public Worker( int worker_img, int rateimge,String category, String fixedServece) {
        this.category = category;
        this.fixedServece = fixedServece;
        Worker_img = worker_img;
        this.rateimge = rateimge;
    }

    private int Worker_img;

    public int getRateimge() {
        return rateimge;
    }

    private  int rateimge;



    public String getFixedServece() {
        return fixedServece;
    }

    public int getWorker_img() {
        return Worker_img;
    }

    public String getPric() {
        return pric;
    }

  //  private int Worker_img;
    private String pric ;


    public Worker(String fixedServece, String category) {
        this.fixedServece = fixedServece;
        this.category = category;
    }



    public Worker(int img_worker,String fixedServece, String category) {
        this.fixedServece = fixedServece;
        this.category = category;
        this.Worker_img = img_worker;
    }






    public Worker(int Worker_img, String category ) {
        this.category = category;
        this.Worker_img = Worker_img;
    }


    public String getCategory() {
        return category;
    }


//   // public int getImg_category() {
//        return img_category;
//    }



}
