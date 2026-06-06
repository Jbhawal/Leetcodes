$outputFile = "solved_problems.txt"
$rootFolder = "D:\JB\Leetcodes"

"" | Out-File $outputFile

Get-ChildItem $rootFolder -Directory | Sort-Object Name | ForEach-Object {
    Add-Content $outputFile $_.Name
    Add-Content $outputFile ("-" * $_.Name.Length)

    Get-ChildItem $_.FullName -Filter "*.java" |
        Sort-Object Name |
        Select-Object -ExpandProperty Name |
        Add-Content $outputFile

    Add-Content $outputFile ""
}

Write-Host "Created $outputFile"