public class Rectangle {
    int width;
    int height;
    int area;

    void setWidth(int w){
        if(w < 0){
            System.out.println("Error");
        } else{
            width = w;
        }

    }

    int getWidth(){
        return width;
    }

    void setHeight(int h){
        height = h;
    }

    int getHeight(){
        return height;
    }

    int getArea(){
        area = getHeight() * getWidth();
        //area = height * width;
        return area;
    }
}
