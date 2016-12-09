# DropDownAlert

Simple Drop Down Alert for android 

![demo](https://github.com/quickcoding/DropDownAlert/blob/master/app/demo-dropdown-1.gif)


Alert message: 

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

Notification message:

```java
Button show_with_image=(Button)findViewById(R.id.show_with_image);
downAlertImage=new DropDownAlert(this,getWindow().getContext(),true);
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

Drop down alert click handler:

```java
downAlertImage.setDropDownAlertListener(new DropDownAlert.DropDownAlertListener() {
            @Override
            public void onClick(View v) {

                Toast toast = Toast.makeText(getApplicationContext(),"You just click me !!",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();

            }
});

```    
 ![demo2](https://github.com/quickcoding/DropDownAlert/blob/master/app/demo-dropdown-2.gif)
