- 27.1
```java
double [] tab = new double[10];
for (int i = 0;i<tab.length;i++){
    tab[i] = Math.random();
    sop(tab[i]);
}
// Boucle special tableau
for (double x : tab){
    // x = Math.random();
    // Faux car x est un variable local donc ne modifie pas la tableau
    sop(x);
}
```
- 27.2
```java
Point []tab = new Point [10];
for (int i=0; i<tab.length; i++){
    tab[i] = new Point();
    sop(tab[i]);
}
for (Point p : tab){
    sop(p);
}
```
- 27.3
```java
sop(t1==t2);//affiche false
sop(t1==t3);//affiche true
```