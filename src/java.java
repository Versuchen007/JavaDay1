/*Toan Tu
        z = x % y;          <--- Tinh so du (z = x + y = x - y = x / y = x *y   cong = tru = chia = nhan)*/

/*Toan Tu + 
        /*Toan Tu Gan Mo Rong
        x +=y <-- x = x + y    (-=; *=; /=; %=)
        Toan Tu Tang Giam
        x++ dung a r tang 1
        ++x cong 1 r dung a;         Tuc la x = 10 + 1 , x = 11 + 1 (x-- giong vay)*/

/*Khi dung %.2f thi in ra can ghi 
        System.out.printf(%.2f, x) 
        String y = String.format("%.2f", x)
        double result = Math.floor(value * 100) / 100.0 (dung cho 2 so sau dau phai ko lam tron)
        System.out.printf("%.2", c, b); */

/*equalsIgnoreCase : so sanh chu hoa chu thuong chu khac nhau*/

/*lenh giong if else
        switch(e){
                case 1:
                case 10:
                System.out.print();
                break;
                case 4:
                case 6:
                        System.out.print("30");
                        break;
                case 2: 
                        System.out.print(t ? 29 : 28);
                        break;
                        default:()*/
        
/* in ra 1 tab ngoai may tinh
        import javax.swing.JOptionPane
        OptionPane.showInputDialog()
        System.exit(0)*/ 

/*Vòng lặp: 
        do-while lap truoc kiem tra sau
        while kiem tra truoc lap sau
                for (x,t,y)
                        x la khai bao khoi tao
                        t la dieu kien
                        y la kieu lap tuc la i++, i--  */

/*Phương thức:
        -  void chỉ thực hiện 1 công việc sau khi kết thúc
        -  trả về giá trị int x = Integer.parseInt()
        -  vd: public static void displayMessege (x){
                System.out.print()        } 
        thì x sẽ được dùng lại ở các lớp public khác đc 
        -  a(1, 2)
                displayValue(int1, int)
        -  nếu khác voi ở public static .... mà thay bằng ví dụ int(String) thì bắt buộc phải có return
        vd: public static int um(a1, a2)
                { int a;
                    a = a1+a2;
                    return a; // sẽ kết thúc phương thức tức public và trả 1 kết quả về a rồi sẽ dùng a cho phương thức khác được
                }*/