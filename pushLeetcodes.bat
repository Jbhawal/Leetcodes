@echo off
cd /d/JB/Leet codes

REM Get the current date in YYYY-MM-DD format
for /f "tokens=1-3 delims=/" %%a in ('date /t') do (
    set "MM=%%a"
    set "DD=%%b"
    set "YYYY=%%c"
)
set "today=%YYYY%-%MM%-%DD%"

git add .
git commit -m "Update LeetCode solutions on %today%"
git push origin main

echo LeetCode solutions pushed to GitHub successfully!
pause
