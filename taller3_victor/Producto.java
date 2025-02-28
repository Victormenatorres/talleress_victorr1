class Producto {
    String nombre;
    double precio;
    int stok;
    
    Producto(String nombre, double precio, int stok){
    this.nombre = nombre;
    this.precio =precio;
    this.stok = stok;
    }
     void mostrarInfo(){
        System.out.println(" Nombre del Producto" + this.nombre);
        System.out.println(" Precio :" + this.precio);
        System.out.println("Stok :" + this.stok);
    
     }
     
    }
     