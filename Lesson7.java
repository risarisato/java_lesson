class Lesson7 {
    public static void main(String[] args){
        int i = 0;
        while( i < 3){
            System.out.println("i=" + i);
            i++;
        }
        for(int A = 0; A < 2; A++){
            System.out.println("A=" + A);
        }
    
        int[] score = new int[3];
        score[0] = 80;
        score[1] = 100;
        score[2] = 75;

        String[] name = {"菅原", "村山", "井上"};

        for(int B =0; B < score.length; B++){
            System.out.println(name[B] + "さん：" + score[B] + "点");            
        }
        System.out.println("受験者数：" + score.length + "名");
    }
}

        /* 
        System.out.println(name[0] + "さん：" + score[0] + "点");
        System.out.println(name[1] + "さん：" + score[1] + "点");
        System.out.println(name[2] + "さん：" + score[2] + "点");
        System.out.println("受験者数：" + score.length + "名");
        */
