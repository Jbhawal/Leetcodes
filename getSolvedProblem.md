//write either of these in terminal to get a file of list of solved problems

Get-ChildItem -Recurse -File > solved_problems.txt
Get-ChildItem -Recurse -Filter *.java | Select-Object -ExpandProperty Name > solved_problems.txt

OR just run the generate_list.ps1 file