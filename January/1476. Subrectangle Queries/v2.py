from typing import List

class SubrectangleQueries:
    actions=[]
    rectangle = []
    def __init__(self, rectangle: List[List[int]]):
        self.actions.clear()
        self.rectangle = rectangle

    def updateSubrectangle(self, row1: int, col1: int, row2: int, col2: int, newValue: int) -> None:
        self.actions.insert(0,[row1,row2,col1,col2,newValue])

    def getValue(self, row: int, col: int) -> int:
        
        for i in self.actions:
            if i[0]<=row<=i[1] and i[2]<=col<=i[3]:
                return i[4]
        return self.rectangle[row][col]


rectangle = [
    [1,2,1],
    [4,3,4],
    [3,2,1],
    [1,1,1]
]

print(rectangle)
obj = SubrectangleQueries(rectangle)

# Series of calls
print(obj.getValue(0,2))
obj.updateSubrectangle(0,2,2,2,5)
print(obj.rectangle)
print(obj.getValue(0,2))
print(obj.getValue(3,1))
obj.updateSubrectangle(3,0,3,2,10)
print(rectangle)
print(obj.getValue(3,1))
print(obj.getValue(0,2))