class Rectangle{
      int largura,altura;
      int a,b,c,d;
      Rectangle(int x1,int y1,int x2,int y2){
            Point p1 = new Point(x1,y1);
            Point p2 = new Point(x2,y2);
            largura = p2.x - p1.x;
            altura = p2.y - p1.y;
            a = p1.x;
            b = p1.y;
            c = p2.x;
            d = p2.y;
      }

      Rectangle(Point p1, Point p2){
            
            largura = p2.x - p1.x;
            altura = p2.y - p1.y;
            a = p1.x;
            b = p1.y;
            c = p2.x;
            d = p2.y;
      }

      int area(){
            return largura * altura;
      }

      int perimeter(){
            return largura*2 + altura*2;
      }

      boolean pointInside(Point p){
            if((a <= p.x) && (p.x <= c) && (b <= p.y) && (p.y <= d))
                  return true;
            else return false;
    }
    boolean rectangleInside(Rectangle r){
        if((a <= r.a) && (r.c <= c) && (b <= r.b) && (r.d <= d))
            return true;
      else return false;
    }
}