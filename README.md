# Assignment01
answer to question(a):
    outer loop= for(int i=n/2; i<=n; i++);
    it starts from n/2 and runs till n
    so it runs n-n/2=(n/2) times and we will ignore the constants such as 1/2
    then we get O(n)
    for the inner loop we have for (int j=2; j<=n; j=j*2)which starts from 2 and runs till n
    but j is getting multiplied by 2 every time so it runs log base 2 (n) but we will ignore the constants therefore Olog(n) and since it is inner loop it gets run by the outer loop so total complexity= O(n)*Olog(n)=O(nlogn)
 


answer to question no(b): 

for the 1st if condition it is a constant time operation O(n) and for the while loop it runs till i*i<=x or i<=√x so the time complextiy is O(√x).

Answer to the question no 2
I used the two-pointer approach. One pointer starts at the beginning of the array and another at the end. In each step, I calculate the area between the lines at these pointers.I kept updating the maximum area found until the pointers meet.
and time complexity is O(n)
