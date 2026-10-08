class Solution:
    def isValidSudoku(self, board: list[list[str]]) -> bool:
        n=len(board)
        rows=[set() for _ in range(n)]
        cols=[set() for _ in range(n)]
        box=[set() for _ in range(n)]
        for i in range (n):
            for j in range(n):
                index=(i//3)*3+(j//3)
                if board[i][j]=='.':
                    continue
                elif board[i][j] in rows[i] or board[i][j] in cols[j] or board[i][j] in box[index]:
                    return False
                else:
                    rows[i].add(board[i][j])
                    cols[j].add(board[i][j])
                    box[index].add(board[i][j])
        return True
