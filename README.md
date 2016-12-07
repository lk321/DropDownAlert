# DropDownAlert

Simple Drop Down Alert para android 

Su uso es muy simple 
```java
        private DropDownAlert downAlertImage;
        private DropDownAlert downAlertNoImage;

        downAlertImage=new DropDownAlert(this,getWindow().getContext(),true);
        downAlertNoImage=new DropDownAlert(this,getWindow().getContext(),false);
        
        show_without_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downAlertNoImage.setTitle("Warning!");
                downAlertNoImage.setContent("Do NOT click");
                downAlertNoImage.show();

            }
        });

        show_with_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.logos);
                downAlertImage.setBitmap(bm);
                downAlertImage.setTitle("Quickcoding");
                downAlertImage.setContent("Hello World!");
                downAlertImage.show();
            }
        });
```

 ![demo](https://github.com/quickcoding/DropDownAlert/blob/master/app/demo-dropdown-1.gif)
 ![demo2](https://github.com/quickcoding/DropDownAlert/blob/master/app/demo-dropdown-2.gif)
