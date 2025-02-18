$(document).ready(function() {
    const $customerIdInput = $("#customerId");
    const $customerNameInput = $("#customerName");
    const $customerAddressInput = $("#customerAddress");
    const $customerTableBody = $("tbody");

    // $(document).ready(function () {
    //     function loadCustomers() {
    //         $.get("http://localhost:8080/O11_BackEnd_Web_exploded/api/v1/customer/getAll", function (customers) {
    //             let tableBody = $("#customerTableBody");
    //             tableBody.empty();
    //             customers.forEach(customer => {
    //                 let imageTag = customer.image ? `<img src="data:image/png;base64,${customer.image}" width="50" height="50"/>` : "No Image";
    //                 let row = `<tr>
    //                 <td>${customer.id}</td>
    //                 <td>${customer.name}</td>
    //                 <td>${customer.address}</td>
    //                 <td>${imageTag}</td>
    //             </tr>`;
    //                 tableBody.append(row);
    //             });
    //         });
    //     }
    //
    //     loadCustomers();
    // });


    function loadCustomers() {
        $.get("http://localhost:8080/O11_BackEnd_Web_exploded/api/v1/customer/getAll")
            .done(function(data) {
                $customerTableBody.empty(); // Clear existing rows
                $.each(data, function(index, customer) {
                    const row = `<tr>
                                    <td>${customer.id}</td>
                                    <td>${customer.name}</td>
                                    <td>${customer.address}</td>
                                </tr>`;
                    $customerTableBody.append(row);
                });
            })
            .fail(function(error) {
                console.error("Error fetching customers:", error);
            });
    }

    function saveCustomer() {
        const customerData = {
            id: $customerIdInput.val(),
            name: $customerNameInput.val(),
            address: $customerAddressInput.val()
        };

        $.ajax({
            url: "http://localhost:8080/O11_BackEnd_Web_exploded/api/v1/customer/save",
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify(customerData),
            success: function(data) {
                alert("Customer Saved!");
                loadCustomers();
            },
            error: function(error) {
                console.error("Error saving customer:", error);
            }
        });
    }

    function updateCustomer() {
        const customerData = {
            id: $customerIdInput.val(),
            name: $customerNameInput.val(),
            address: $customerAddressInput.val()
        };

        $.ajax({
            url: "http://localhost:8080/O11_BackEnd_Web_exploded/api/v1/customer/update",
            type: "PUT",
            contentType: "application/json",
            data: JSON.stringify(customerData),
            success: function(data) {
                alert("Customer Updated!");
                loadCustomers();
            },
            error: function(error) {
                console.error("Error updating customer:", error);
            }
        });
    }

    function deleteCustomer() {
        const customerId = $customerIdInput.val();

        $.ajax({
            url: `http://localhost:8080/O11_BackEnd_Web_exploded/api/v1/customer/delete/${customerId}`,
            type: "DELETE",
            success: function(success) {
                if (success) {
                    alert("Customer Deleted!");
                    loadCustomers();
                } else {
                    alert("Customer Not Found!");
                }
            },
            error: function(error) {
                console.error("Error deleting customer:", error);
            }
        });
    }

    $(".btn-success").on("click", saveCustomer);
    $(".btn-warning").on("click", updateCustomer);
    $(".btn-danger").on("click", deleteCustomer);

    loadCustomers();
});
