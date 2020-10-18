# -Composite


Nous souhaitons modéliser une hiérarchie d’employés au sein d’une entreprise. Parmi ces
employés, nous distinguons les employés classiques et les managers. Tous les employés ont un
nom, un prénom, une adresse et font tous partie d’un service particulier (DRH, comptabilité,
informatique…).
Les employés classiques ont, en plus, un nombre d’heures de travail hebdomadaire qui leur est
assigné, ainsi qu’un taux horaire.
Les managers ont, eux, un ensemble d’employés sous leur responsabilité : selon leur niveau
hiérarchique, ils peuvent être responsables d’employés classiques, mais également d’autres
managers. Enfin, les managers, qui ne sont pas au taux horaire, ont un salaire fixe mensuel.
# Question : Proposez une modélisation de ce problème, puis implémentez la solution. Nous devrions
pouvoir, au sein de l’entreprise, connaître les différents employés, éventuellement les personnes
qu’ils managent selon leur responsabilité, et enfin leur salaire mensuel.
