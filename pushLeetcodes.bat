@echo off
cd /d D:\JB\Leetcodes

REM Extract date in YYYY-MM-DD format using WMIC (works consistently)
for /f %%i in ('wmic os get localdatetime ^| find "."') do set datetime=%%i
set today=%datetime:~0,4%-%datetime:~4,2%-%datetime:~6,2%

git add .
git commit -m "Updated Leetcode solution on %today%"
git pull origin main --rebase
git push origin main

echo LeetCode solutions pushed to GitHub successfully!
pause
