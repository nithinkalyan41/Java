<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Error-Handle</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
      <div class="container">
        <div class="row">
          <div class="col-md-6 offset-md-3" >
            <form action="op.jsp">
            <div class="card">
                <div class="card-header bg-dark text-white">
                          <h3>Provide me A two numbers</h3>
                </div>
                <div class="card-body bg-secondary">
                  <div class="form-group">
                        <input type="number" class="form-control" placeholder="enter num1" name="n1">
                      </div>
                  <div class="form-group">
                        <input type="number" class="form-control" placeholder="enter num2" name="n2">
                     </div>
                </div>
                <div class="card-footer text-center bg-dark text-white">
                        <button type="submit" class="btn btn-outline-light">Divide operation</button>
                </div>
            </div>
            </form>
          </div>
        </div>
      </div>

</body>
</html>