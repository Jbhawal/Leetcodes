class MinStack:
    def __init__(self):
        self.stack=[]
        self.sec=[]

    def push(self, value: int) -> None:
    self.stack.append(value)
    // the whole following block can be written as self.sec.append(value if not self.sec else min(value, self.sec[-1]))
        if not self.sec:
            self.sec.append(value)
        elif value<self.sec[-1]:   
            self.sec.append(value)
        else:
            self.sec.append(self.sec[-1])

    def pop(self) -> None:
        self.stack.pop()
        self.sec.pop()

    def top(self) -> int:
        if not self.stack:
            return None
        else:
            return self.stack[-1]
        
    def getMin(self) -> int:
        return self.sec[-1]


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(value)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()