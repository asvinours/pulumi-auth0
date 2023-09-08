// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-auth0/sdk/v2/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// With this resource, you can manage assigned roles for a user.
//
// !> This resource appends a role to a user. In contrast, the `UserRoles` resource manages all the roles assigned
// to a user. To avoid potential issues, it is recommended not to use this resource in conjunction with the
// `UserRoles` resource when managing roles for the same user id.
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
//			admin, err := auth0.NewRole(ctx, "admin", &auth0.RoleArgs{
//				Description: pulumi.String("Administrator"),
//			})
//			if err != nil {
//				return err
//			}
//			user, err := auth0.NewUser(ctx, "user", &auth0.UserArgs{
//				ConnectionName: pulumi.String("Username-Password-Authentication"),
//				Username:       pulumi.String("unique_username"),
//				Email:          pulumi.String("test@test.com"),
//				Password:       pulumi.String("passpass$12$12"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = auth0.NewUserRole(ctx, "userRoles", &auth0.UserRoleArgs{
//				UserId: user.ID(),
//				RoleId: admin.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// This resource can be imported by specifying the user ID and role ID separated by "::" (note the double colon) <userID>::<roleID> # Example
//
// ```sh
//
//	$ pulumi import auth0:index/userRole:UserRole user_role "auth0|111111111111111111111111::role_123"
//
// ```
type UserRole struct {
	pulumi.CustomResourceState

	// Description of the role.
	RoleDescription pulumi.StringOutput `pulumi:"roleDescription"`
	// ID of the role assigned to the user.
	RoleId pulumi.StringOutput `pulumi:"roleId"`
	// Name of the role.
	RoleName pulumi.StringOutput `pulumi:"roleName"`
	// ID of the user.
	UserId pulumi.StringOutput `pulumi:"userId"`
}

// NewUserRole registers a new resource with the given unique name, arguments, and options.
func NewUserRole(ctx *pulumi.Context,
	name string, args *UserRoleArgs, opts ...pulumi.ResourceOption) (*UserRole, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RoleId == nil {
		return nil, errors.New("invalid value for required argument 'RoleId'")
	}
	if args.UserId == nil {
		return nil, errors.New("invalid value for required argument 'UserId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource UserRole
	err := ctx.RegisterResource("auth0:index/userRole:UserRole", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUserRole gets an existing UserRole resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUserRole(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserRoleState, opts ...pulumi.ResourceOption) (*UserRole, error) {
	var resource UserRole
	err := ctx.ReadResource("auth0:index/userRole:UserRole", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UserRole resources.
type userRoleState struct {
	// Description of the role.
	RoleDescription *string `pulumi:"roleDescription"`
	// ID of the role assigned to the user.
	RoleId *string `pulumi:"roleId"`
	// Name of the role.
	RoleName *string `pulumi:"roleName"`
	// ID of the user.
	UserId *string `pulumi:"userId"`
}

type UserRoleState struct {
	// Description of the role.
	RoleDescription pulumi.StringPtrInput
	// ID of the role assigned to the user.
	RoleId pulumi.StringPtrInput
	// Name of the role.
	RoleName pulumi.StringPtrInput
	// ID of the user.
	UserId pulumi.StringPtrInput
}

func (UserRoleState) ElementType() reflect.Type {
	return reflect.TypeOf((*userRoleState)(nil)).Elem()
}

type userRoleArgs struct {
	// ID of the role assigned to the user.
	RoleId string `pulumi:"roleId"`
	// ID of the user.
	UserId string `pulumi:"userId"`
}

// The set of arguments for constructing a UserRole resource.
type UserRoleArgs struct {
	// ID of the role assigned to the user.
	RoleId pulumi.StringInput
	// ID of the user.
	UserId pulumi.StringInput
}

func (UserRoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userRoleArgs)(nil)).Elem()
}

type UserRoleInput interface {
	pulumi.Input

	ToUserRoleOutput() UserRoleOutput
	ToUserRoleOutputWithContext(ctx context.Context) UserRoleOutput
}

func (*UserRole) ElementType() reflect.Type {
	return reflect.TypeOf((**UserRole)(nil)).Elem()
}

func (i *UserRole) ToUserRoleOutput() UserRoleOutput {
	return i.ToUserRoleOutputWithContext(context.Background())
}

func (i *UserRole) ToUserRoleOutputWithContext(ctx context.Context) UserRoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserRoleOutput)
}

func (i *UserRole) ToOutput(ctx context.Context) pulumix.Output[*UserRole] {
	return pulumix.Output[*UserRole]{
		OutputState: i.ToUserRoleOutputWithContext(ctx).OutputState,
	}
}

// UserRoleArrayInput is an input type that accepts UserRoleArray and UserRoleArrayOutput values.
// You can construct a concrete instance of `UserRoleArrayInput` via:
//
//	UserRoleArray{ UserRoleArgs{...} }
type UserRoleArrayInput interface {
	pulumi.Input

	ToUserRoleArrayOutput() UserRoleArrayOutput
	ToUserRoleArrayOutputWithContext(context.Context) UserRoleArrayOutput
}

type UserRoleArray []UserRoleInput

func (UserRoleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserRole)(nil)).Elem()
}

func (i UserRoleArray) ToUserRoleArrayOutput() UserRoleArrayOutput {
	return i.ToUserRoleArrayOutputWithContext(context.Background())
}

func (i UserRoleArray) ToUserRoleArrayOutputWithContext(ctx context.Context) UserRoleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserRoleArrayOutput)
}

func (i UserRoleArray) ToOutput(ctx context.Context) pulumix.Output[[]*UserRole] {
	return pulumix.Output[[]*UserRole]{
		OutputState: i.ToUserRoleArrayOutputWithContext(ctx).OutputState,
	}
}

// UserRoleMapInput is an input type that accepts UserRoleMap and UserRoleMapOutput values.
// You can construct a concrete instance of `UserRoleMapInput` via:
//
//	UserRoleMap{ "key": UserRoleArgs{...} }
type UserRoleMapInput interface {
	pulumi.Input

	ToUserRoleMapOutput() UserRoleMapOutput
	ToUserRoleMapOutputWithContext(context.Context) UserRoleMapOutput
}

type UserRoleMap map[string]UserRoleInput

func (UserRoleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserRole)(nil)).Elem()
}

func (i UserRoleMap) ToUserRoleMapOutput() UserRoleMapOutput {
	return i.ToUserRoleMapOutputWithContext(context.Background())
}

func (i UserRoleMap) ToUserRoleMapOutputWithContext(ctx context.Context) UserRoleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserRoleMapOutput)
}

func (i UserRoleMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*UserRole] {
	return pulumix.Output[map[string]*UserRole]{
		OutputState: i.ToUserRoleMapOutputWithContext(ctx).OutputState,
	}
}

type UserRoleOutput struct{ *pulumi.OutputState }

func (UserRoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UserRole)(nil)).Elem()
}

func (o UserRoleOutput) ToUserRoleOutput() UserRoleOutput {
	return o
}

func (o UserRoleOutput) ToUserRoleOutputWithContext(ctx context.Context) UserRoleOutput {
	return o
}

func (o UserRoleOutput) ToOutput(ctx context.Context) pulumix.Output[*UserRole] {
	return pulumix.Output[*UserRole]{
		OutputState: o.OutputState,
	}
}

// Description of the role.
func (o UserRoleOutput) RoleDescription() pulumi.StringOutput {
	return o.ApplyT(func(v *UserRole) pulumi.StringOutput { return v.RoleDescription }).(pulumi.StringOutput)
}

// ID of the role assigned to the user.
func (o UserRoleOutput) RoleId() pulumi.StringOutput {
	return o.ApplyT(func(v *UserRole) pulumi.StringOutput { return v.RoleId }).(pulumi.StringOutput)
}

// Name of the role.
func (o UserRoleOutput) RoleName() pulumi.StringOutput {
	return o.ApplyT(func(v *UserRole) pulumi.StringOutput { return v.RoleName }).(pulumi.StringOutput)
}

// ID of the user.
func (o UserRoleOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v *UserRole) pulumi.StringOutput { return v.UserId }).(pulumi.StringOutput)
}

type UserRoleArrayOutput struct{ *pulumi.OutputState }

func (UserRoleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserRole)(nil)).Elem()
}

func (o UserRoleArrayOutput) ToUserRoleArrayOutput() UserRoleArrayOutput {
	return o
}

func (o UserRoleArrayOutput) ToUserRoleArrayOutputWithContext(ctx context.Context) UserRoleArrayOutput {
	return o
}

func (o UserRoleArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*UserRole] {
	return pulumix.Output[[]*UserRole]{
		OutputState: o.OutputState,
	}
}

func (o UserRoleArrayOutput) Index(i pulumi.IntInput) UserRoleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *UserRole {
		return vs[0].([]*UserRole)[vs[1].(int)]
	}).(UserRoleOutput)
}

type UserRoleMapOutput struct{ *pulumi.OutputState }

func (UserRoleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserRole)(nil)).Elem()
}

func (o UserRoleMapOutput) ToUserRoleMapOutput() UserRoleMapOutput {
	return o
}

func (o UserRoleMapOutput) ToUserRoleMapOutputWithContext(ctx context.Context) UserRoleMapOutput {
	return o
}

func (o UserRoleMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*UserRole] {
	return pulumix.Output[map[string]*UserRole]{
		OutputState: o.OutputState,
	}
}

func (o UserRoleMapOutput) MapIndex(k pulumi.StringInput) UserRoleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *UserRole {
		return vs[0].(map[string]*UserRole)[vs[1].(string)]
	}).(UserRoleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserRoleInput)(nil)).Elem(), &UserRole{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserRoleArrayInput)(nil)).Elem(), UserRoleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserRoleMapInput)(nil)).Elem(), UserRoleMap{})
	pulumi.RegisterOutputType(UserRoleOutput{})
	pulumi.RegisterOutputType(UserRoleArrayOutput{})
	pulumi.RegisterOutputType(UserRoleMapOutput{})
}
