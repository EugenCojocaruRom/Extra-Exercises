EX_30MAR - Winter Activity Organizer
Write a function 'organizeWinterActivities' that takes 'familyMembers', activities and returns a formatted seating chart string.
The function organizes relatives into winter activity groups, applying strategic sorting and name reversing for optimal family reunion coordination.
Logic:
 - Group family members by their preferred activities
 - Sort activities by popularity (most participants first)
 - Within each activity group, reverse the order of member names
 - Format each line as "Activity: [Member3, Member2, Member1] (X guests)"
Parameters:
 - familyMembers (String[]): Array of family member names
 - activities (String[]): Array of preferred activities (same length as familyMembers)
Returns: Formatted seating chart string. Format: Ice Skating: [Bob, Alice] (2 guests) Sledding: [Charlie] (1 guest)

