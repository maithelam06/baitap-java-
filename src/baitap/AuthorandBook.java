    package baitap;

    public class AuthorandBook {
        private String name;
        private Author [] authors;
        private double price;
        private int qty=0;
        public AuthorandBook(String name,Author[] authors,double price){
            this.name=name;
            this.authors=authors;
            this.price=price;
        }
        public AuthorandBook(String name,Author[] authors,double price,int qty){
            this.name=name;
            this.authors=authors;
            this.price=price;
            this.qty=qty;
        }
        String getName(){
            return name;
        }
        double getPrice(){
            return price;
        }
        void setPrice(double price){
            this.price=price;
        }
        int getQty(){
            return qty;
        }
        void setQty(int qty){
            this.qty=qty;
        }
        public Author[] getAuthors(){
            return authors;
        }
        //@Override
        public String toString(){
            return "Book[name="+name+",authors={Author"+getAuthorNames()+
                    "]},price="+price +",qty="+qty;
        }
        String getAuthorNames(){
            StringBuilder authorNamesBuilder=new StringBuilder();
            for(int i=0;i<authors.length;i++){
                authorNamesBuilder.append("[name=")
                                .append(authors[i].getName())
                                .append(",emai=")
                                .append(authors[i].getEmail())
                                .append(",gender=")
                                .append(authors[i].getGender());
                if(i<authors.length-1){
                    authorNamesBuilder.append("],");
                }
                if(i==authors.length-1){
                    authorNamesBuilder.append("]");
                }
            }
            return authorNamesBuilder.toString();
        }

    }

