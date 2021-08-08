#Autor: Jeisson Llarave
@stories
Feature: join today
  As  a user, I want ti learn how  to automate screamplay at the join today with the automation course
  @scenario1
  Scenario Outline: Search for  a automation  course
    Given than brandon wants to learn automation at the join today
      |  srtFirstName    | srtLastName   |  srtEmail    | srtDateBirth    |
      |  <srtFirstName>  | <srtLastName> |  <srtEmail>  | <srtDateBirth>  |

    Examples:
      | srtFirstName | srtLastName   | srtEmail               | srtDateBirth
      | jeisson      | llarave       | jellarav@gmail.com     | 13-08-1995
