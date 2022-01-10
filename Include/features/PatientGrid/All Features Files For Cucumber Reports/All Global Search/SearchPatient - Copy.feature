@PatientGrid
Feature: Search Patient

  Background: 
    Given I navigate to patient grid

  @SearchByFirstNameANDlastName
  Scenario Outline: Search Patient Using First and Last Name From Patient Grid
    When I search <Patient> using global search
    Then I should see <Patient_Name> as patient with <MRN> as MRN and <DOB> as DOB and <Patient_Status> as Status on patient grid

    Examples: 
      | Patient   | Patient_Name | MRN                                | DOB        | Patient_Status |
      | Dermo505, Mac505 | Dermo505, Mac505    | PE05E6ECEF0E46443B887BA108B24D9049 | 02/02/2000 | Active         |

  @SearchByFirstName
  Scenario Outline: Search Patient Using First Name From Patient Grid
    When I search <Patient> using global search
    Then I should see <Patient_Name> as patient with <MRN> as MRN and <DOB> as DOB and <Patient_Status> as Status on patient grid

    Examples: 
      | Patient | Patient_Name | MRN                                | DOB        | Patient_Status |
      | Mac505     | Dermo505, Mac505    | PE05E6ECEF0E46443B887BA108B24D9049 | 02/02/2000 | Active         |

  @SearchByLastNameANDFirstName
  Scenario Outline: Search Patient Using Last and First Name From Patient Grid
    When I search <Patient> using global search
    Then I should see <Patient_Name> as patient with <MRN> as MRN and <DOB> as DOB and <Patient_Status> as Status on patient grid

    Examples: 
      | Patient   | Patient_Name | MRN                                | DOB        | Patient_Status |
      | Dermo505, Mac505 | Dermo505, Mac505    | PE05E6ECEF0E46443B887BA108B24D9049 | 02/02/2000 | Active         |

  @SearchByLastName
  Scenario Outline: Search Patient Using Last Name From Patient Grid
    When I search <Patient> using global search
    Then I should see <Patient_Name> as patient with <MRN> as MRN and <DOB> as DOB and <Patient_Status> as Status on patient grid


    Examples: 
      | Patient | Patient_Name | MRN                                | DOB        | Patient_Status |
      | Dermo505    | Dermo505, Mac505    | PE05E6ECEF0E46443B887BA108B24D9049 | 02/02/2000 | Active         |

  @SearchByMRN
  Scenario Outline: Search Patient Using MRN From Patient Grid
    When I search <Patient> using global search
    Then I should see <Patient_Name> as patient with <MRN> as MRN and <DOB> as DOB and <Patient_Status> as Status on patient grid

    Examples: 
      | Patient                            | Patient_Name | MRN                                | DOB        | Patient_Status |
      | EntMerging505 | Dermo505, Mac505    | PE05E6ECEF0E46443B887BA108B24D9049 | 02/02/2000 | Active         |
