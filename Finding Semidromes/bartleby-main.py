def is_semidrome(s):
    half_length = int(len(s)/2)     #dividing the length to half
    if(len(s) % 2 == 0):    
        str1 = s[0:half_length]
        str2 = s[half_length:half_length-1]
        if(str1 == str1[::-1] and str2 == str2[::-1]):
            print("True")
        else:
            print("False")
    else:
        print("False")
        

Value = input("Enter a String: ").lower()
string = ""
# checking for the non alphabetical letters if found remove from the string
for i in range(0,len(Value)):
    if(Value[i].encode()[0]>= 97 and Value[i].encode()[0] <= 122):
        string+=Value[i]
is_semidrome(string)



