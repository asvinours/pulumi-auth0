// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-auth0/sdk/v2/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source to retrieve a specific Auth0 user by `userId`.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-auth0/sdk/v2/go/auth0"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := auth0.LookupUser(ctx, &auth0.LookupUserArgs{
//				UserId: "auth0|34fdr23fdsfdfsf",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupUser(ctx *pulumi.Context, args *LookupUserArgs, opts ...pulumi.InvokeOption) (*LookupUserResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupUserResult
	err := ctx.Invoke("auth0:index/getUser:getUser", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getUser.
type LookupUserArgs struct {
	// ID of the user.
	UserId string `pulumi:"userId"`
}

// A collection of values returned by getUser.
type LookupUserResult struct {
	// Custom fields that store info about the user that impact the user's core functionality, such as how an application functions or what the user can access. Examples include support plans and IDs for external accounts.
	AppMetadata string `pulumi:"appMetadata"`
	// Indicates whether the user is blocked or not.
	Blocked bool `pulumi:"blocked"`
	// Name of the connection from which the user information was sourced.
	ConnectionName string `pulumi:"connectionName"`
	// Email address of the user.
	Email string `pulumi:"email"`
	// Indicates whether the email address has been verified.
	EmailVerified bool `pulumi:"emailVerified"`
	// Family name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	FamilyName string `pulumi:"familyName"`
	// Given name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	GivenName string `pulumi:"givenName"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	Name string `pulumi:"name"`
	// Preferred nickname or alias of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	Nickname string `pulumi:"nickname"`
	// Initial password for this user. Required for non-passwordless connections (SMS and email).
	Password string `pulumi:"password"`
	// List of API permissions granted to the user.
	Permissions []GetUserPermissionType `pulumi:"permissions"`
	// Phone number for the user; follows the E.164 recommendation. Used for SMS connections.
	PhoneNumber string `pulumi:"phoneNumber"`
	// Indicates whether the phone number has been verified.
	PhoneVerified bool `pulumi:"phoneVerified"`
	// Picture of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	Picture string `pulumi:"picture"`
	// Set of IDs of roles assigned to the user.
	Roles []string `pulumi:"roles"`
	// ID of the user.
	UserId string `pulumi:"userId"`
	// Custom fields that store info about the user that does not impact a user's core functionality. Examples include work address, home address, and user preferences.
	UserMetadata string `pulumi:"userMetadata"`
	// Username of the user. Only valid if the connection requires a username.
	Username string `pulumi:"username"`
	// Indicates whether the user will receive a verification email after creation. Overrides behavior of `emailVerified` parameter.
	VerifyEmail bool `pulumi:"verifyEmail"`
}

func LookupUserOutput(ctx *pulumi.Context, args LookupUserOutputArgs, opts ...pulumi.InvokeOption) LookupUserResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupUserResult, error) {
			args := v.(LookupUserArgs)
			r, err := LookupUser(ctx, &args, opts...)
			var s LookupUserResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupUserResultOutput)
}

// A collection of arguments for invoking getUser.
type LookupUserOutputArgs struct {
	// ID of the user.
	UserId pulumi.StringInput `pulumi:"userId"`
}

func (LookupUserOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupUserArgs)(nil)).Elem()
}

// A collection of values returned by getUser.
type LookupUserResultOutput struct{ *pulumi.OutputState }

func (LookupUserResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupUserResult)(nil)).Elem()
}

func (o LookupUserResultOutput) ToLookupUserResultOutput() LookupUserResultOutput {
	return o
}

func (o LookupUserResultOutput) ToLookupUserResultOutputWithContext(ctx context.Context) LookupUserResultOutput {
	return o
}

// Custom fields that store info about the user that impact the user's core functionality, such as how an application functions or what the user can access. Examples include support plans and IDs for external accounts.
func (o LookupUserResultOutput) AppMetadata() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.AppMetadata }).(pulumi.StringOutput)
}

// Indicates whether the user is blocked or not.
func (o LookupUserResultOutput) Blocked() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupUserResult) bool { return v.Blocked }).(pulumi.BoolOutput)
}

// Name of the connection from which the user information was sourced.
func (o LookupUserResultOutput) ConnectionName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.ConnectionName }).(pulumi.StringOutput)
}

// Email address of the user.
func (o LookupUserResultOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Email }).(pulumi.StringOutput)
}

// Indicates whether the email address has been verified.
func (o LookupUserResultOutput) EmailVerified() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupUserResult) bool { return v.EmailVerified }).(pulumi.BoolOutput)
}

// Family name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
func (o LookupUserResultOutput) FamilyName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.FamilyName }).(pulumi.StringOutput)
}

// Given name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
func (o LookupUserResultOutput) GivenName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.GivenName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupUserResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Id }).(pulumi.StringOutput)
}

// Name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
func (o LookupUserResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Name }).(pulumi.StringOutput)
}

// Preferred nickname or alias of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
func (o LookupUserResultOutput) Nickname() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Nickname }).(pulumi.StringOutput)
}

// Initial password for this user. Required for non-passwordless connections (SMS and email).
func (o LookupUserResultOutput) Password() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Password }).(pulumi.StringOutput)
}

// List of API permissions granted to the user.
func (o LookupUserResultOutput) Permissions() GetUserPermissionTypeArrayOutput {
	return o.ApplyT(func(v LookupUserResult) []GetUserPermissionType { return v.Permissions }).(GetUserPermissionTypeArrayOutput)
}

// Phone number for the user; follows the E.164 recommendation. Used for SMS connections.
func (o LookupUserResultOutput) PhoneNumber() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.PhoneNumber }).(pulumi.StringOutput)
}

// Indicates whether the phone number has been verified.
func (o LookupUserResultOutput) PhoneVerified() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupUserResult) bool { return v.PhoneVerified }).(pulumi.BoolOutput)
}

// Picture of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
func (o LookupUserResultOutput) Picture() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Picture }).(pulumi.StringOutput)
}

// Set of IDs of roles assigned to the user.
func (o LookupUserResultOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupUserResult) []string { return v.Roles }).(pulumi.StringArrayOutput)
}

// ID of the user.
func (o LookupUserResultOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.UserId }).(pulumi.StringOutput)
}

// Custom fields that store info about the user that does not impact a user's core functionality. Examples include work address, home address, and user preferences.
func (o LookupUserResultOutput) UserMetadata() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.UserMetadata }).(pulumi.StringOutput)
}

// Username of the user. Only valid if the connection requires a username.
func (o LookupUserResultOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Username }).(pulumi.StringOutput)
}

// Indicates whether the user will receive a verification email after creation. Overrides behavior of `emailVerified` parameter.
func (o LookupUserResultOutput) VerifyEmail() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupUserResult) bool { return v.VerifyEmail }).(pulumi.BoolOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupUserResultOutput{})
}
