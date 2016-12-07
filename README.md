# DropDownAlert

Simple Drop Down Alert para android 

Su uso es muy simple 

```java
   private DropDownAlert downAlertNoImage;

   downAlertNoImage=new DropDownAlert(this,getWindow().getContext(),false);
        
   show_without_image.setOnClickListener(new View.OnClickListener() {
            @Override
       public void onClick(View view) {
                downAlertNoImage.setTitle("Warning!");
                downAlertNoImage.setContent("Do NOT click");
                downAlertNoImage.show();

            }
    });   
```

 ![demo](https://github.com/quickcoding/DropDownAlert/blob/master/app/demo-dropdown-1.gif)
 
 ```java
    Button show_without_image=(Button)findViewById(R.id.show_without_image);

    downAlertNoImage=new DropDownAlert(this,getWindow().getContext(),false);

    show_without_image.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view) {
                downAlertNoImage.setTitle("Warning!");
                downAlertNoImage.setContent("Do NOT click");
                downAlertNoImage.show();

            }
        });
```
      
 ![demo2](https://github.com/quickcoding/DropDownAlert/blob/master/app/demo-dropdown-2.gif)
