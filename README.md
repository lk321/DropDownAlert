# DropDownAlert

Simple Drop Down Alert para android 

![demo](https://github.com/quickcoding/DropDownAlert/blob/master/app/demo-dropdown-1.gif)


Para usar como un mensaje de alerta: 

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
Para usar como un mensaje de algun chat: 

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
Manejar el click del Drop Down Alert:

```java
 downAlertNoImage.setTraffictListener(new DropDownAlert.DropDownAlertListener() {
            @Override
            public void onClick(View v) {

                Toast toast = Toast.makeText(getApplicationContext(),"You just click me !!",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();

            }
        });

```    
 ![demo2](https://github.com/quickcoding/DropDownAlert/blob/master/app/demo-dropdown-2.gif)
