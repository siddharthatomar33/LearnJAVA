list1=["a","abc","bccd","accd","acca"]
newlist=[]
for i in list1:
    if(type(i)==str):
        if len(i)>=2 and i[0]==i[-1]:
            newlist.append(i)
print(newlist)
