EX\_14FEB - Password verification system

Create a password verification system.

Create three methods that check different aspects of password validation using string comparison.

\* Use these test passwords:

 - storedPassword = "SecurePass123"

 - userAttempt = "securepass123", "SecurePass123", "SecurePass12", "password123", "12345678", "qwerty123"

\* Create these validation methods:

 - checkExactMatch: Check if the attempt matches stored password exactly format: "Password match (exact): \[true/false]"

 - checkIgnoreCase: Check if the attempt matches when ignoring case format: "Password match (ignore case): \[true/false]"

 - comparePasswords: Use compareTo to check if attempt is:

  > "Before" the stored password alphabetically

  > "After" the stored password alphabetically

  > "Exact match" with the stored password format: "Password comparison: \[Before/After/Exact match]"

